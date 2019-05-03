/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cyrilelijahaurino
 */
public class MyClass extends Thread {
    String threadName;
    
    public MyClass(String msg) {
        this.threadName = msg;
    }
    
    @Override
    public void run() {
//        System.out.println(threadName);
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + ":" + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
