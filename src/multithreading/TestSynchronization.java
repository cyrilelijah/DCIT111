/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author cyrilelijahaurino
 */
public class TestSynchronization {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileHandling fh = new FileHandling();
        fh.setFile(new File("testSync.txt"));
        Thread t1 = new Thread(new WriteToFile(fh, "Writting in t1"));
        Thread t2 = new Thread(new WriteToFile(fh, "Writting in t2"));
//        
//        
        t1.start();
        t2.start();
        
//        t1.join();
//        t2.join();
        
//        PrintDemo pd = new PrintDemo();
//        ThreadDemo t1 = new ThreadDemo("T1", pd);
//        ThreadDemo t2 = new ThreadDemo("T2", pd);
//        
//        t1.start();
//        t2.start();
    }
}
