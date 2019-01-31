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
public class Aircon {
    private float temp;
    private String brand;

    public Aircon() {
        System.out.println("Creating our aircon");
        System.out.println("Loading....");
    }
    
    public void open(){
    
    }
    
    public void setToMax(){
        
    }

    public String getBrand() {
        return brand;
    }

    public float getTemp() {
        return temp;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    @Override //change the implementation
    public String toString() {
        return "Brand: " + brand + "\n" + 
                "Temp: " + temp;
    }
    
    
}
