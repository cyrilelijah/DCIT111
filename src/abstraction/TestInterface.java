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
public class TestInterface {
    public static void main(String[] args) {
        Student student = new Student();
        student.code();
        
        Programmer pS = new Student();
        pS.code();
        pS.drinkCoffee();
        
        Singer s = new Student();
        s.sing();
    }
}
