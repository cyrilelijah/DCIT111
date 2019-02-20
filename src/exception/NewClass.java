/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author cyrilelijahaurino
 */
public class NewClass {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String input="";
//        int num=0;
//        System.out.println("Enter a number");
//        input = reader.readLine();
//        try{
//            num = Integer.parseInt(input);
//        } catch(NumberFormatException ex){
//            num = 12;
//        }
//        
////        int quo = div(num, 0);
//        
////        System.out.println(quo);
//        Person person;
//        try {
//            person = null;
//            person.eat();
//        } catch (NullPointerException e) {
//            System.out.println("Person is not instantiated");
//        } finally{
//            person = new Person();
//            person.eat();
//        }
        
        int size = 0;
        System.out.println("Enter size of array: ");
        input = reader.readLine();
        size = Integer.parseInt(input);
        String[] names = new String[size];
        
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter names: ");
            names[i] = reader.readLine();
        }
        
        System.out.println("At index 3:" + names[3]);
        
    }

//    public static int div(int x, int y){
//        if (y==0) {
//            throw new ArithmeticException("You cannot divide by 0");
//        }
//        return x / y;
//    }
}
