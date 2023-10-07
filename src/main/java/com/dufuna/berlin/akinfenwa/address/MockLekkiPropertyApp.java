package com.dufuna.berlin.akinfenwa.address;

import com.dufuna.berlin.akinfenwa.address.model.LekkiProperty;
import com.dufuna.berlin.akinfenwa.address.service.LekkiPropertyService;
import com.dufuna.berlin.akinfenwa.address.service.LekkiPropertyServiceClss;
import com.dufuna.berlin.akinfenwa.address.service.MockLekkiPropertyService;

import java.util.List;

public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        SimpleLekkiPropertyRepository propertyRepository = new SimpleLekkiPropertyRepositoryImpl();
        LekkiPropertyService propertyService = new LekkiPropertyServiceClss(propertyRepository);

        for (int i = 1; i <= 5; i++) {
            LekkiProperty property = new LekkiProperty();
            property.setName("Property" + 1);
            property.setDescription("Description" + 1);
            property.saveProperty(property);
        }
        int propertyId = 3;
        LekkiProperty singleProperty = propertyService.getProperty(propertyId);

        System.out.println("Single property:");

        System.out.println(singleProperty);

    }
}

