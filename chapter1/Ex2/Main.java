/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter1.Ex2;

/**
 *
 * @author tu650
 */
public class Main {
 
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generic", "Method"};

        System.out.println("Mảng Integer:");
        printArray(intArray);

        System.out.println("\nMảng String:");
        printArray(strArray);
    }
}
