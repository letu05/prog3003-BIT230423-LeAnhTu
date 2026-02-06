/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chapter1.Ex5;

import java.util.LinkedList;

/**
 *
 * @author tu650
 */
public class Bai5 {
    public static void main(String [] args){
        LinkedList<Integer> que = new LinkedList<>();
        
        que.add(10);
        que.add(50);
        que.add(100);
        que.add(500);
        
        que.addFirst(5);
        que.addLast(1000);
        
        System.out.println(que);
        
    }
}
