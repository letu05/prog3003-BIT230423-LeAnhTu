/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3.Ex2;

/**
 *
 * @author tu650
 */
public class NumberPrinter implements Runnable {
      @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        for (int i = 1; i <= 10; i++) {
            System.out.println(threadName + " : " + i);
        }
    }
}
