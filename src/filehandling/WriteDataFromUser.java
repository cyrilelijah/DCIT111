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
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author cyrilelijahaurino
 */
public class WriteDataFromUser {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String input = "";
        System.out.println("Enter data: ");
        input = reader.readLine();
        File file = new File("fromUser.txt");
        writeTo(file, input);
    }
        
    public static void writeTo(File file, String data) throws IOException{
        FileWriter out = null;
        try {
            out = new FileWriter(file.getAbsolutePath(), true);
            BufferedWriter bw = new BufferedWriter(out);
            bw.write(data + "\n");
            bw.close();// Always close stream.
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        } finally {
            if (out != null) {
                out.close(); // Always close stream
            }
        }
    }
}
