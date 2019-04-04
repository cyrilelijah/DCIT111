/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author cyrilelijahaurino
 */
public class TestByteStream {

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;//reading
        FileOutputStream out = null;//writing
        
        File file = new File("input.txt");
        file.createNewFile();
        System.out.println(file.getAbsolutePath());
        File file2 = new File("output.txt");
        file2 .createNewFile();
        try {
            in = new FileInputStream(file.getAbsolutePath());
            out = new FileOutputStream(file2.getAbsolutePath());
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } finally {
            if (in != null) {
                in.close();// Always close stream
            }
            if (out != null) {
                out.close();// Always close stream
            }
        }
    }
}
