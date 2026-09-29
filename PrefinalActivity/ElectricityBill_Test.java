/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrefinalActivity;

/**
 *
 * @author User
 */
public class ElectricityBill_Test {

    public static void main(String[] args) {

        ElectricityBill customer1 = new ElectricityBill(
                "EL-1001",
                "Juan Santos",
                "Residential",
                1250,
                1475
        );
        customer1.displayBill();
    }
}
