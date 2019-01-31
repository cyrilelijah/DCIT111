/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dcit111;

/**
 *
 * @author cyrilelijahaurino
 */
public class Teacher extends Person{

    public Teacher() {
    }

    
    public Teacher(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("The teacher is eating");
    }
    
    
}
