/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializtion;

import java.io.Serializable;

/**
 *
 * @author cyrilelijahaurino
 */
public class Employee implements Serializable{
    transient int id;//if marked transient it will not be serialized
    transient String name;
    String address;
    double salary;
    String position;

    public Employee() {
    }

    public Employee(String name, String address, double salary, String position) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.position = position;
    }   
}
