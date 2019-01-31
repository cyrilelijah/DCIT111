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
public class Laptop {
    private String hdd;
    private int ram;
    private String os;
    private String brand;

    public Laptop() {//Constructor
    }
    
    public Laptop(String hdd){//overloaded constructor
        this.hdd = hdd;
    }

    public Laptop(String hdd, int ram, String os, String brand) {
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.brand = brand;
    }
    
    
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    public void setHdd(String hdd){
        this.hdd = hdd;
    }
    
    public String getHdd(){
        return hdd;
    }
    
    public int getRam(){
        return ram;
    }

    public String getBrand() {
        return brand;
    }

    public String getOs() {
        return os;
    }
    
    public void open(){
        System.out.println("Starting");
    }
    public void open(String toOpen){
        System.out.println("Opening.." + toOpen);
    }
    
    public void close(){
    }
}
