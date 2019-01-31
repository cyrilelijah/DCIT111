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
public class TestAircon {
    public static void main(String[] args) {
        Aircon aircon = new Aircon();
        aircon.setTemp(-5);
        aircon.setBrand("Carrier");
        
        System.out.println(aircon);
    }
}
