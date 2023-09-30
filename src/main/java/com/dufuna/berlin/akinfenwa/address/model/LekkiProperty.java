package com.dufuna.berlin.akinfenwa.address.model;

public class LekkiProperty {
    private String propertyId;
    private String propertyAddress;
    private String propertyType;
    private int numberOfBedrooms;
    private int numberOfSittingRooms;
    private int numberOfKitchens;
    private int numberOfBathrooms;
    private int numberOfToilets;
    private String propertyOwner;
    private String description;
    private String validFrom;
    private String validTo;

    public LekkiProperty() {
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
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

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public LekkiProperty(String propertyId, String propertyAddress, String propertyType, int numberOfBedrooms, int numberOfSittingRooms, int numberOfKitchens, int numberOfBathrooms, int numberOfToilets, String propertyOwner, String description, String validFrom, String validTo) {
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
}
