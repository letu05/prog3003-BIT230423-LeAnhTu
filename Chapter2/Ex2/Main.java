/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2.Ex2;

/**
 *
 * @author tu650
 */
public class Main {
     public static void main(String[] args) {

        Notification n1 = NotificationFactory.createNotification("sms");
        n1.notifyUser();

        Notification n2 = NotificationFactory.createNotification("email");
        n2.notifyUser();
    }
}
