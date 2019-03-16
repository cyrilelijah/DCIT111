/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializtion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author cyrilelijahaurino
 */
public class TestSerialization {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Kjasdh kals";
        e.id = 1;
        e.position = "Java Developer";
        e.salary = 45000;
        e.address = "sdasdasd";
        
        File file = new File("employee.ser");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e);//serialize object
            System.out.println("Employee was serialized.");
            System.out.println(file.getAbsolutePath());
            fos.close();
            oos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        } catch (IOException ex) {
            System.out.println("Error in serializing...");
        }
    }
}
