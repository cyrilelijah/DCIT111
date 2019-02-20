package lab1;

public class TestCompany {
    public static void main(String[] args) {
        Address companyAddress = new Address(null, null, null, null);//4pts
        Address[] empAddress = new Address[3];
        empAddress[0] = new Address(null, null, null, null);//4pts
        empAddress[1] = new Address(null, null, null, null);//4pts
        empAddress[2] = new Address(null, null, null, null);//4pts
        
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(null, 0, empAddress[0], null);//3pts
        employees[1] = new Employee(null, 0, empAddress[1], null);//3pts
        employees[2] = new Employee(null, 0, empAddress[2], null);//3pts
       
        Company company = new Company(null, companyAddress, employees);//1pt
        System.out.println(company);
        
        System.out.println("No. of Employees: ");//2pts get the number of employee
    }
}
