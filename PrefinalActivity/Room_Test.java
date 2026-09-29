/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class Room_Test {
    
    public static void main(String[] args) {

        
        Room[] rooms = {
            new StandardRoom(101, "Pedro Cruz", 3),
            new DeluxeRoom(202, "Ana Reyes", 2),
            new Suite_Room(301, "Carlo Santos", 2)
        };

       
        for (Room room : rooms) {
            room.displayBooking();
        }
    }

}
