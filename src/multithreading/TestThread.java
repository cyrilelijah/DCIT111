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
public class TestThread {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 1: " + i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 2: " + i);
                    if (i % 2 == 0) {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException ex) {

                        }
                    }
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 3: " + i);
                    if (i % 2 == 0) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {

                        }
                    }
                }
            }
        });

//        t1.start();
//        t2.setPriority(1);
//        t2.start();
//        t3.start();
        for (int i = 0; i < 8; i++) {
            Thread t = new Thread(new MyRunnableInterface());
            t.start();
        }
    }
}
