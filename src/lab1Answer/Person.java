/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1Answer;

/**
 * Object Person with <br> 
 * protected fields: name, age and address.
 * @see lab1Answer.Human
 * @author Cyril
 */
public class Person extends Human{  
    protected String name;
    protected int age;
    protected Address address;
    
    /**
     * Default constructor of the Person.
     */
    public Person() {
    }

    /**
     * Overloaded constructor for the person with three parameters
     * <h1>3pts</h1>
     * @param name set the name of the Person
     * @param age set the age of the Person
     * @param address set the address of the Person 
     */
    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * Returns a concatination of the name, age and address
     * <h1>3pts</h1>
     * @return String
     */
    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nAddress: " + address;
    }

    public String getName() {
        return name;
    }
}
