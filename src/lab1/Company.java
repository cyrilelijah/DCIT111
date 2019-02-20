package lab1;


import lab1.Employee;
import lab1.Address;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Object Company with a <br> 
 * private final fields: name, Address and array of Employees
 * @author put your name here
 * @author put your name here
 */
public class Company {
    private final String name; 
    private final Address address;
    private final Employee[] employees;
    
    public Company() {
        this.name = null;
        this.address = null;
        this.employees = null;
    }
    
    public Company(String name, Address address, Employee[] employees) {
        this.name = name;
        this.address = address;
        this.employees = employees;
    }

    public Address getAddress() {
        return null;// To do:
    }
    
    public Employee[] getEmployees() {
        return null;// To do:
    }

    public String getName() {
        return null;// To do:
    }
    
    public int getEmployeeCount(){
        return 0;// To do:
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(employee).append("\n");
        }
        return "Company name: " + name + 
                "\nCompany address: " + address + 
                "\nEmployees: \n" + sb;
    }
}
