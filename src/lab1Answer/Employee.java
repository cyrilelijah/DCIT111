/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1Answer;

/**
 * Object Employee with a <br> 
 * private field: position <br> 
 * public static field: count
 * private double: salary
 * 
 * @see lab1Answer.Human
 * @see lab1Answer.Person
 * @author Cyril
 */
public class Employee extends Person {
    private String position;
    public static int count;
    private double salary;

    /**
     * Default constructor of the Employee.
     */
    public Employee() {
        count++;
    }
    
    /**
     * Overloaded constructor of the Employee with three parameters
     * <h1>4pts</h1>
     * @param name set the name of the employee
     * @param age set the age of the employee
     * @param address set the address of the employee 
     */
    public Employee(String name, int age, Address address) {
        super(name, age, address);
        count++;
    }
    
    /**
     * Overloaded constructor for the Employee with four parameters.
     * <h1>5pts</h1>
     * @param name set the name of the employee
     * @param age set the age of the employee
     * @param address set the address of the employee 
     * @param position set the position of the employee 
     */
    public Employee(String name, int age, Address address, String position) {
        super(name, age, address);
        this.position = position;
        count++;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    
    /**
     * Returns a concatination of the name, age and address and the position of the emloyee
     * <h1>3pts</h1>
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + "\nPosition: " + position + "\n";
    }
    
    public void work(){
        System.out.println("The employee is working");
    }
    
}
