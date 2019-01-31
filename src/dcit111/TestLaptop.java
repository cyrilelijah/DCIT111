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
public class TestLaptop {
    public static void main(String[] args) {
//        Laptop laptop = new Laptop();
//        laptop.setHdd("1Tb");
//        System.out.println(laptop.getHdd());
//        laptop.open();
//        laptop.open("Java");
        
        Laptop l1 = new Laptop("2tb");
        Laptop l2 = new Laptop("1tb", 4, "Windows", "Lenovo");
        System.out.println(l2.getHdd());
        System.out.println(l2.getRam());
        System.out.println(l2.getOs());
        System.out.println(l2.getBrand());
        
        l2.setRam(8);
        System.out.println(l2.getRam());
        
    }
}
