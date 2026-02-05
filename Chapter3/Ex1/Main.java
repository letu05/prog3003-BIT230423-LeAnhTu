/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter3.Ex1;

/**
 *
 * @author tu650
 */
public class Main {
     public static void main(String[] args) {

        // Chạy Thread
        WorkerThread t1 = new WorkerThread();
        t1.start(); // KHÔNG dùng run()

        // Chạy Runnable
        WorkerRunnable worker = new WorkerRunnable();
        Thread t2 = new Thread(worker);
        t2.start();
    }
}
