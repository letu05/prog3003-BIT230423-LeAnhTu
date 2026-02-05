/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter1.Ex1;

/**
 *
 * @author tu650
 */
public class Main {
    public static void main (String[] args){
        Test<Integer> testInt = new Test<>();
        testInt.set(10);
        System.out.println("Interger" + testInt.get());
        
        Test<String> testString = new Test<>();
        testString.set("Hello World");
        System.out.println("String"+ testString.get());
    }
}
