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
public class TestCar {
    public static void main(String[] args) {
        Car c = new Car();//instantiation
        Car c1 = new Car();//instantiation
        c.brand = "Foton";
        c.color = "Pink";
        
        System.out.println("Brand: " + c.brand);
        System.out.println("Color: " + c.color);
        c.brand = "Chev";
        c.color = "Yellow";
        
        System.out.println("Brand: " + c.brand);
        System.out.println("Color: " + c.color);
        System.out.println(Car.count);//access count directly from class name
    }
}
