package com.dufuna.berlin.toluakindolie.service;

import com.dufuna.berlin.toluakindolie.model.LekkiProperty;
/**
 * Mock implementation of the LekkiPropertyService interface.
 * Provides basic functionality for saving and retrieving properties,
 * while logging method calls.
 */
public class MockLekkiPropertyService implements LekkiPropertyService {

    private LekkiProperty property; // Holds the saved property

    /**
     * Saves a Lekki property and logs the method call.
     *
     * @param property The property to be saved.
     */

    public void saveProperty(LekkiProperty property) {
        System.out.println("MockLekkiPropertyService.saveProperty called");
        this.property = property;
    }

    /**
     * Retrieves a single Lekki property and logs the method call.
     *
     * @return The saved LekkiProperty, or null if no property has been saved.
     */
    public LekkiProperty getProperty() {
        System.out.println("MockLekkiPropertyService.getProperty called");
        return this.property;
    }
}