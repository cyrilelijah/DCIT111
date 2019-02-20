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
public class TestException {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String input = "";
        int size = 0;
        String[] names;
        System.out.println("Enter size of array:");
        input = reader.readLine();
        try{
            size = Integer.parseInt(input);
        } catch (NumberFormatException e){
            size = 2;
        } finally {
            names = new String[size];    
        } 
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name:");
            names[i] = reader.readLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
