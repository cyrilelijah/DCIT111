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
public class TestThread2 {
    public static void main(String[] args) {
        MyClass t1 = new MyClass("T1");
        MyClass t2 = new MyClass("T2");
        MyClass t3 = new MyClass("T3");
//        Thread t2 = new Thread(new MyClass2());
//        Thread t2 = new Thread(new MyClass2());
        
//        t2.setPriority(8);
//        t3.setPriority(9);
        t1.start();
        t3.start();
        t2.start();
    }
}
