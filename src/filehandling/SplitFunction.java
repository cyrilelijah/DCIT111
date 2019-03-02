/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

/**
 *
 * @author cyrilelijahaurino
 */
public class SplitFunction {
    public static void main(String[] args) {
        String data = "new data new data new data new data";
        String[] arrayData = data.split("\\s");
        for (int i = 0; i < arrayData.length; i++) {
            System.out.println(arrayData[i]);
        }
    }
}
