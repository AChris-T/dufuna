package com.dufuna.berlin.akinfenwa.address;

import com.dufuna.berlin.akinfenwa.address.model.LekkiProperty;
import com.dufuna.berlin.akinfenwa.address.service.LekkiPropertyService;
import com.dufuna.berlin.akinfenwa.address.service.MockLekkiPropertyService;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        LekkiProperty property= new LekkiProperty();
        property.setPropertyId("12345");
        property.setPropertyAddress("24 Ibadan");

        LekkiPropertyService propertyService = new MockLekkiPropertyService();
        propertyService.saveProperty(property);

        LekkiProperty retrievedProperty = propertyService.getProperty();


    }
}