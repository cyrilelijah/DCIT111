/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cyrilelijahaurino
 */
public class WriteToFile extends Thread {

    FileHandling fh;

    String toWrite;
    public WriteToFile(FileHandling fh, String toWrite) {
        this.fh = fh;
        this.toWrite = toWrite;
    }

    @Override
    public void run() {
//        synchronized (fh) {
            try {
                System.out.println(this.getName());
                System.out.println("Writting...");
                fh.write(toWrite);
                Thread.sleep(2000);
                
                System.out.println(this.getName());
                System.out.println("Writting...");
                fh.write(toWrite);
                Thread.sleep(2000);
                
                System.out.println(this.getName());
                System.out.println("Writting...");
                fh.write(toWrite);
                Thread.sleep(2000);
            } catch (IOException ex) {
                Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(WriteToFile.class.getName()).log(Level.SEVERE, null, ex);
            }
//        }
    }

}
