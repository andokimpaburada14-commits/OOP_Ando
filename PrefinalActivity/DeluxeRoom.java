/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class DeluxeRoom extends Room{
    
    public DeluxeRoom(int roomNumber, String guestName,
                      int numberOfNights) {
        super(roomNumber, "Deluxe", guestName, numberOfNights);
    }

    @Override
    public double calculateBookingCost() {
        double dailyRate = 2500;
        double breakfastFee = 300;

        return (dailyRate * numberOfNights)
                + (breakfastFee * numberOfNights);
    }
    
}
