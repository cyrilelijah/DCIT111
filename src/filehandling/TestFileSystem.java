/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.Iterator;

/**
 *
 * @author cyrilelijahaurino
 */
public class TestFileSystem {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        
        Iterable<FileStore> it = fs.getFileStores();
        
        for (Iterator iterator = it.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            System.err.println(next);
        }
    }
}
