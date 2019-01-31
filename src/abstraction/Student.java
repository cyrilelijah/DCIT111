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
public class Student extends Person implements Programmer, Singer{

    @Override
    public void sleep() {
        System.out.println("The student is sleeping");
    }

    @Override
    public void walk() {
        System.out.println("The student is walking");
    }

    @Override
    public void code() {
        System.out.println("coding");
    }

    @Override
    public void drinkCoffee() {
        System.out.println("Drinking");
    }

    @Override
    public void sing() {
        System.out.println("Singing.");
    }
    
}
