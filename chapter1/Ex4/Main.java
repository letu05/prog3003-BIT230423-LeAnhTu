/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter1.Ex4;
import java.util.ArrayList;

/**
 *
 * @author tu650
 */
public class Main {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        System.out.println("Danh sach hoa qua" +fruits);
        fruits.add(1,"Mango");
        System.out.println("Danh sach hoa qua moi " +fruits);
        int index = fruits.indexOf("Banana");
        if(index != -1){
            fruits.set(index,"Grapes");
        }
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Danh sách trái cây: " + fruits);
        System.out.println("Apple có tồn tại không? " + hasApple);
    }
      
}
