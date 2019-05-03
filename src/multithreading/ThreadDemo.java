/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author cyrilelijahaurino
 */
public class ThreadDemo extends Thread {
    Thread t;
    PrintDemo pd;
    String name;

    public ThreadDemo(String name, PrintDemo pd) {
        this.name = name;
        this.pd = pd;
    }

    @Override
    public void run() {
        synchronized(pd){
            pd.print();
        }
    }

    @Override
    public synchronized void start() {
        System.out.println("Starting " + name);
        if (t == null) {
            t = new Thread(this, name);
            t.start();
        }
    }

}
