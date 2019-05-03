/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.io.IOException;

/**
 *
 * @author cyrilelijahaurino
 */
public class ReadFile implements Runnable{
    FileHandling fh;

    public ReadFile(FileHandling fh) {
        this.fh = fh;
    }
    
    @Override
    public void run() {
//        synchronized(fh){
            try {
                System.out.println("Reading...");
                fh.read();
            } catch (IOException ex) {
                System.out.println(ex);
            }
//        }
    }
    
}
