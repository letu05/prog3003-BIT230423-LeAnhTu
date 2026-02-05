/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter2.Ex1;

/**
 *
 * @author tu650
 */
public class DatabaseConnection {
    private static DatabaseConnection instance;
    
    private DatabaseConnection(){
        System.out.println("Database Connected");
    }
    
    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
