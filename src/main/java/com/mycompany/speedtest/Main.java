/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.speedtest;

/**
 *
 * @author reyes
 */
public class Main {
    public static RegularDriver firstDriver = new RegularDriver("Jorge Reyes", "1DDX82F", "Tesla Model X");
    public static TruckDriver secondDriver = new TruckDriver("Mario Chan", "2DK903X", 250);
    
    public static void main(String[] args) {
        System.out.println("+ ================================================");
        System.out.println("+ First Driver Info");
        System.out.println("+ -----------------");
        System.out.println("+ Driver's Name: " + firstDriver.name);
        System.out.println("+ Driver's License ID: " + firstDriver.getLicenseID());
        System.out.println("+ Driver's Car Model: " + firstDriver.getCarModel());
        System.out.println("+ =================");
        System.out.println("+ Second Driver Info");
        System.out.println("+ -----------------");
        System.out.println("+ Driver's Name: " + secondDriver.name);
        System.out.println("+ Driver's License ID: " + secondDriver.getLicenseID());
        System.out.println("+ Driver's MAX Truck Weight: " + secondDriver.getMaxTruckWeight());
        System.out.println("+ ================================================");
    }
    
}
