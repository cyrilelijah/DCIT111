/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author cyrilelijahaurino
 */
public class CountWordData {
    public static void main(String[] args) throws IOException {
        File file = new File("fileWriter.txt");
        file.createNewFile();
        FileReader in = null;
        try {
            in = new FileReader(file.getAbsolutePath());
            BufferedReader br = new BufferedReader(in);
            String toRead = null;
            int count = 0;
            while ((toRead = br.readLine()) != null) {
                String[] array = toRead.split("\\s");//remove the spaces then save each word to the array
                for (int i = 0; i < array.length; i++) {
                    if (array[i].equals("data")) {
                        count++;//add 1 every time it reads the word 'data'
                    }
                }
                System.out.println(toRead);
            }
            System.out.println("Count of word data: " + count);
            br.close();//always close stream
        } catch(FileNotFoundException ex){
            System.out.println("File not found!");
        } finally {
            if (in != null) {
                in.close();// Always close stream
            }
        }
    }
}
