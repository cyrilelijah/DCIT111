/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author cyrilelijahaurino
 */
public class TestDataStream {
    public static void main(String[] args) {
        File file = new File("dataStream.txt");
        DataOutputStream dataOut = null;//output
        try {
            dataOut = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(file, true)));
            dataOut.writeUTF("daskdjklas");
            dataOut.writeLong(12321321L);
            dataOut.writeInt(28);
            dataOut.writeDouble(10.5d);

//            dataOut.close();
            System.out.println("Done writing in " + file.getAbsolutePath());
        } catch (FileNotFoundException ex) {
            System.err.println("File not found!");
        } catch (IOException ex) {
            System.err.println("Error writing file in '" + file.getAbsolutePath() + "'");
        } finally {
            try {
                dataOut.close();
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
        
        DataInputStream dataIn = null;
        try {
            dataIn = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(file)));
            while (dataIn.available() > 0) {
                System.out.println(dataIn.readUTF());
                System.out.println(dataIn.readLong());
                System.out.println(dataIn.readInt());
                System.out.println(dataIn.readDouble());
            }
//            dataIn.close();
        } catch (FileNotFoundException ex) {
            System.err.println("File not found");
        } catch (IOException ex) {
            System.err.println(ex);
        } finally {
            try {
                dataIn.close();
            } catch (IOException ex) {
                System.err.println(ex);
            }
        }
    }
}