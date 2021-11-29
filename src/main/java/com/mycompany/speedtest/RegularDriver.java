/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.speedtest;

/**
 *
 * @author reyes
 */
public class RegularDriver extends Driver {
    
    private String licenseID;
    private final String carModel;
    
    public RegularDriver(String newName, String newLicenseID, String newCarModel) {
        super(newName);
        this.licenseID = newLicenseID;
        this.carModel = newCarModel;
    }
    
    /**
     * Makes the driver drive
     */
    public void drive() {
        System.out.println("Driving... brr...");
    }
    
    /**
     * 
     * @return Driver's License ID 
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
     * @return The Driver car model 
     */
    public String getCarModel() {
        return this.carModel;
    }
    
}
