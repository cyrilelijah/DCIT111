/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author cyrilelijahaurino
 */
public abstract class Person {

    public Person() {
    }
    
    public abstract void sleep();
    public abstract void walk();
    
    public void eat(){
        System.out.println("");
    }
}
