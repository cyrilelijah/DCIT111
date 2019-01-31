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
public class TestStudent {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.name = "Jasper";
//        student.age = 30;
//        student.gender = "female";
//        System.out.println(student);

        Student student2 = new Student("Ryan", 31, "Female");
        System.out.println(student2);
        
        student2.eat();
        student2.sleep();
        
        //overloading method same name 
        //diff param
        //overriding method same name same param
        // diff implementation
    }
}
