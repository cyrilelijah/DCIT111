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
public class Car {
    String color;//attrib
    String brand;
    static int count;

    public Car() {//default constructor
        count++;
    }
    
    public void move(){//behavior
        System.out.println("The car is moving");
    }
}
