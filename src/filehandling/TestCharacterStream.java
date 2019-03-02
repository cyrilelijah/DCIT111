/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author cyrilelijahaurino
 */
public class TestCharacterStream {

    public static void main(String[] args) throws IOException {
        File file = new File("fileWriter.txt");
        file.createNewFile();
        
        //write content to the file
        FileWriter out = null;
        try {
            out = new FileWriter(file.getAbsolutePath(), true);
            BufferedWriter bw = new BufferedWriter(out);
            bw.write("new data");
//            bw.write("another data");
            bw.close();// Always close files.
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        } finally {
            if (out != null) {
                out.close();// Always close stream
            }
        }
        //Read the content of the file
        FileReader in = null;
        try {
            in = new FileReader(file.getAbsolutePath());
            BufferedReader br = new BufferedReader(in);
            String toRead = null;
            while ((toRead = br.readLine()) != null) {
                System.out.println(toRead);//read every line
            }
            br.close();// always close streams
        } catch(FileNotFoundException ex){
            System.out.println("File not found!");
        } finally {
            if (in != null) {
                in.close();// Always close stream
            }
        }
    }
}
