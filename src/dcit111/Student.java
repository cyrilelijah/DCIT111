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
public class Student extends Person{
    private int studNo;
    
    public Student() {
        System.out.println("Constructing a student");
    }
    
    public Student(String name, int age, String gender) {
        super(name, age, gender);//super constructor                            //refers to the superclass
    }

    public void setStudNo(int studNo) {
        this.studNo = studNo;
    }

    public int getStudNo() {
        return studNo;
    }
    
    @Override
    public void eat(){
        System.out.println("The student is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The student is sleeping");
    }
    
    public void study(){
        System.out.println("The student is studying");   
    }
}
