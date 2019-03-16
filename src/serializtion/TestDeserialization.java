/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializtion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author cyrilelijahaurino
 */
public class TestDeserialization {
    public static void main(String[] args) {
        Employee e = null;
        File file = new File("employee.ser");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //deserialize process
            e = (Employee) ois.readObject();//cast the object 
            //
            fis.close();
            ois.close();
            System.out.println("Successfully deserialized..");
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        } catch (IOException ex) {
            System.out.println("Error on deserializing..");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not ");
        }
        
        System.out.println("ID:" + e.id);
        System.out.println("Name: " + e.name);
        System.out.println("Address:" + e.address);
        System.out.println("Position: "+ e.position);
        System.out.printf("Salary %.2f\n", e.salary);
        
    }
}
