/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.speedtest;

/**
 *
 * @author reyes
 */
public class TruckDriver extends Driver {
      
    private String licenseID;
    private final int MAX_TRUCK_WEIGHT_KG;
    
    public TruckDriver(String newName, String newLicenseID, int NEW_MAX_TRUCK_WEIGHT_KG) {
        super(newName);
        this.licenseID = newLicenseID;
        this.MAX_TRUCK_WEIGHT_KG = NEW_MAX_TRUCK_WEIGHT_KG;
    }
    
    /**
     * Makes the driver drive
     */
    public void drive() {
        System.out.println("Driving... brr...");
    }
    
    /**
     *
     * @return Driver's license ID 
     */
    public String getLicenseID() {
        return this.licenseID;
    }
    
    /**
     * 
     * @param newLicenseID New LicenseID to update the current one 
     */
    public void setLicenseID(String newLicenseID) {
        this.licenseID = newLicenseID;
    }
    
    /**
     * 
     * @return Max Weight the truck can handle
     */
    public int getMaxTruckWeight() {
        return this.MAX_TRUCK_WEIGHT_KG;
    }
    
}
