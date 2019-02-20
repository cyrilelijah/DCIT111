package lab1;

public class Employee extends Person {
    String position; // To do:
    int count; // To do:
    double salary; // To do:
 
    public Employee() {
    }
    
    public Employee(String name, int age, Address address) {
        super(null, 0, null);// To do:
    }
    
    public Employee(String name, int age, Address address, String position) {
        super(name, age, address);// To do:
        this.position = position;
    }
 
    @Override
    public String toString() {
        return null;// To do:
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}