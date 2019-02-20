/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1Answer;

/**
 * Advance Programming Laboratory 1
 * @author Cyril
 */
public class TestCompany {
    public static void main(String[] args) {
        Address companyAddress = new Address("", "", "", "", "Philippines");
        Address[] empAddress = new Address[3];
        empAddress[0] = new Address("", "", "Dasma", "Cavite", "Philippines");
        empAddress[1] = new Address("","Brgy. 5", "Mendez", "Cavite", "Philippines");
        empAddress[2] = new Address("", "", "San Pablo City", "Laguna", "Philippines");
        
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("John", 35, empAddress[0], "Full stack developer");
        employees[1] = new Employee("Arvin", 35, empAddress[1], "Front end developer");
        employees[2] = new Employee("George", 35, empAddress[2], "Back end developer");
        
        Person owner = new Person("Unknown", 0, companyAddress);
        Company company = new Company("Not Zero Solutions", "IT Company", owner.getName(), companyAddress, employees);
        System.out.println(company);
        System.out.println("No. of Employees: " + company.getEmployeeCount());
    }
}
