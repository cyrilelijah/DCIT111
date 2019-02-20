/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1Answer;

/**
 * Object Address with a <br> 
 * private fields: street, barangay, city, province and country
 * @author Cyril
 */
public class Address {
    private String street;
    private String barangay;
    private String city;
    private String province;
    private String country;
    
    /**
     * Default constructor of Address.
     */
    public Address() {
        this.street = "";
        this.barangay = "";
        this.city = "";
        this.province = "";
        this.country = "";
    } 

    /**
     * Create an overloaded constructor of the Address with four parameters
     * <h1>5pts</h1>
     * @param street set the street of the address
     * @param barangay set the barangay of the address
     * @param city set the city of the address 
     * @param province set the province of the address
     * @param country set the country of the address 
     */
    public Address(String street, String barangay, String city, String province, String country) {
        this.street = street;
        this.barangay = barangay;
        this.city = city;
        this.province = province;
        this.country = country;
    }
    
    /**
     * Returns a concatination of the street, barangay, city, province and the country
     * If street, barangay, city, province, country is empty or not set
     * Return No Street, No barangay, No city, No province, No country.
     * <h1>5pts</h1>
     * @return String
     */
    @Override
    public String toString() {
        if(street.equals(""))
            street = "No Street";
        if(barangay.equals(""))
            barangay = "No Barangay";
        if(city.equals(""))
            city = "No City";
        if(province.equals(""))
            province = "No Province";
        if(country.equals(""))
            country = "No Country";
        return street + " " + barangay + ", " + city + ", " + 
                province + ", " + country;
    }    
}
