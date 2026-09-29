/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class Suite_Room extends Room {
    
     public Suite_Room (int roomNumber, String guestName,
                     int numberOfNights) {
        super(roomNumber, "Suite", guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        double dailyRate = 4000;
        double serviceFee = 1000;

        return (dailyRate * numberOfNights) + serviceFee;
    }
    
}
