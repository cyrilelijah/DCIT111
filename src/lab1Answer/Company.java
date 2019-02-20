/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1Answer;

/**
 * Object Company with a <br> 
 * private fields: name, type, Address and array of Employees
 * @author Cyril
 */
public class Company {
    private String name;
    private String type;
    private String owner;
    private Address address;
    private Employee[] employees;
    
    /**
     * Default constructor of the company.
     */
    public Company() {
        this.name = null;
        this.type = null;
        this.owner = null;
        this.address = null;
        this.employees = null;
    }
    
    /**
     * Overloaded constructor of the Company with three parameters
     * @param name set the name of the Company
     * @param type set the type of the Company
     * @param owner set the owner of the Company
     * @param address set the address of the Company
     * @param employees  set the employees of the Company
     */
    public Company(String name, String type, String owner, Address address, Employee[] employees) {
        this.name = name;
        this.type = type;
        this.owner = owner;
        this.address = address;
        this.employees = employees;
    }

    /**
     * Returns the information of the company.
     * @return company info
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(employee).append("\n");
        }
        return "Company name: " + name + 
                "\nType of company: " + type +                
                "\nCompany owner: " + owner + 
                "\nCompany address: " + address + 
                "\nEmployees: \n" + sb;
    }
    
    /**
     * Returns an array of employees
     * <h1>5pts</h1>
     * @return employees
     */
    public Employee[] getEmployees() {
        return employees;
    }

    /**
     * Returns the address of the company
     * <h1>5pts</h1>
     * @return address
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Returns the name of the company
     * <h1>5pts</h1>
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the employee count
     * <h1>5pts</h1>
     * @return employee count 
     */
    public int getEmployeeCount(){
        return Employee.count;
    }
}
