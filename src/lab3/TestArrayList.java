/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cyrilelijahaurino
 */
public class TestArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ssad");
        list.add("sda");
        list.add("dassd");
        list.add("qweqw");
        
        String[] arr = new String[2];
        arr[0] = "sdas";
        arr[1] = "sdas";
        System.out.println(arr[0]);
        System.out.println(arr[1]);
//        arr[2] = "sda";
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        list.add("sadas");
                
        
    }
}
