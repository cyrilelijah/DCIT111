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
public class TestPolymorphism {
    public static void main(String[] args) {
        Person person = new Student();//upcasting
        person.eat();
        
        Student student = (Student) person;//downscasting
        student.eat();
        
        Person teacher = new Teacher("Cyril", 22, "male");
        teacher.eat();
        
        Person[] persons = new Person[2];//polymorphic array
        persons[0] = new Student();
        persons[1] = new Teacher();
        
//        for (int i = 0; i < persons.length; i++) {
//            persons[i].eat();
//        }
        
        for (Person p : persons) {
            p.eat();
        }
    }
}
