/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

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
public class FileHandling {

    private BufferedReader reader;
    private BufferedWriter writer;
    private File file;

    public FileHandling(){

    }

    public void read() throws IOException {
        reader = new BufferedReader(
                new FileReader(file.getAbsolutePath()));
        String toRead = null;
        while ((toRead = reader.readLine()) != null) {
            System.out.println(toRead);
        }
        reader.close();
    }

    public void write(String toWrite) throws IOException {
        writer = new BufferedWriter(
                new FileWriter(file.getAbsolutePath(), true));
        writer.write(toWrite + "\n");
        writer.close();
    }

    public void setFile(File file) {
        this.file = file;
    }

}
