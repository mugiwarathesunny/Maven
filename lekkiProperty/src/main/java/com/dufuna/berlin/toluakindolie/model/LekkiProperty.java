package com.dufuna.berlin.toluakindolie.model;

import java.time.LocalDate;
import java.util.Date;

/**
 * Represents a property in Lekki with various attributes.
 */
public class LekkiProperty {
    private int propertyId;              // Unique identifier
    private String propertyAddress;      // Property's address
    private String propertyType;         // Type of property (e.g., house, flat)
    private int numberOfBedrooms;        // Number of bedrooms
    private int numberOfSittingRooms;    // Number of sitting rooms
    private int numberOfKitchens;        // Number of kitchens
    private int numberOfBathrooms;       // Number of bathrooms
    private int numberOfToilets;         // Number of toilets
    private String propertyOwner;        // Owner's name
    private String description;          // Description of the property
    private LocalDate validFrom;         // Validity start date
    private LocalDate validTo;           // Validity end date


    public LekkiProperty() {
    }

    /**
     * Parameterized constructor to initialize all fields.
     */
    public LekkiProperty(int propertyId, String propertyAddress, String propertyType, int numberOfBedrooms,
                         int numberOfSittingRooms, int numberOfKitchens, int numberOfBathrooms, int numberOfToilets,
                         String propertyOwner, String description, LocalDate validFrom, LocalDate validTo) {
        this.propertyId = propertyId;
        this.propertyAddress = propertyAddress;
        this.propertyType = propertyType;
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfSittingRooms = numberOfSittingRooms;
        this.numberOfKitchens = numberOfKitchens;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfToilets = numberOfToilets;
        this.propertyOwner = propertyOwner;
        this.description = description;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    // Getters and setters for each field
    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public int getNumberOfSittingRooms() {
        return numberOfSittingRooms;
    }

    public void setNumberOfSittingRooms(int numberOfSittingRooms) {
        this.numberOfSittingRooms = numberOfSittingRooms;
    }

    public int getNumberOfKitchens() {
        return numberOfKitchens;
    }

    public void setNumberOfKitchens(int numberOfKitchens) {
        this.numberOfKitchens = numberOfKitchens;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDate validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDate getValidTo() {
        return validTo;
    }

    public void setValidTo(LocalDate validTo) {
        this.validTo = validTo;
    }

    /**
     * Returns a string representation of the property.
     * Includes property id, address, and type as comma-separated fields.
     *
     * @return A string representation of the property.
     */
    @Override
    public String toString() {
        return propertyId + ", " + propertyAddress + ", " + propertyType;
    }

    /**
     * Generates a hash code for the property.
     * The hash code is based on the property id.
     *
     * @return The hash code of the property.
     */
    @Override
    public int hashCode() {
        return propertyId;
    }

    /**
     * Compares this property to another object for equality.
     * Properties are considered equal if their property ids are the same.
     *
     * @param obj The object to compare with.
     * @return True if the properties are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        LekkiProperty that = (LekkiProperty) obj;
        return propertyId == that.propertyId;
    }

}