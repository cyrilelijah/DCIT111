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
public class TestAbstraction {
    public static void main(String[] args) {
        Person person = new Student();
        person.eat();
        person.walk();
    }
}
