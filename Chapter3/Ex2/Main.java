/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3.Ex2;

/**
 *
 * @author tu650
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Thread t = new Thread(new NumberPrinter(), "Thread-" + i);
            t.start();
        }
    }
}
