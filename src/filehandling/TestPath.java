/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author cyrilelijahaurino
 */
public class TestPath {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\New Folder\\output.txt");//absolute path
//        File file1 = new File(p1.toString());
//        
//        boolean f = file1.exists();
//        System.out.println(f);
//        System.out.println(file1.getAbsolutePath());
        
        Path p2 = Paths.get("output.txt");//relative path
        File file2 = new File(p2.toString());
        System.out.println(file2.getAbsolutePath());
    }
}
