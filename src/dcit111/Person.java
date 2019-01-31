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
public class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person() {
        System.out.println("Constructing a person...");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public void eat(){
        System.out.println("The person is eating");
    }
    
    public void sleep(){
        System.out.println("The person is sleeping");
    
    }
    
    @Override
    public String toString(){
        return "Name: " + name + 
                "\n" + "Age: " + age + 
                "\n" +  "Gender: " + gender;
    }

//    @Override
//    public String toString() {
//        return super.toString(); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
}
