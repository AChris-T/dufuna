package com.dufuna.berlin.akinfenwa.address.service;

import com.dufuna.berlin.akinfenwa.address.SimpleLekkiPropertyRepository;
import com.dufuna.berlin.akinfenwa.address.model.LekkiProperty;

import java.util.List;

public class LekkiPropertyServiceClss implements LekkiPropertyService {
    private final SimpleLekkiPropertyRepository propertyRepository;

    public LekkiPropertyServiceClss(SimpleLekkiPropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public LekkiProperty saveProperty(LekkiProperty lekkiProperty) {
        LekkiProperty property = new LekkiProperty();
        return propertyRepository.save(property);

    }

    @Override
    public LekkiProperty getProperty(int id) {
        return propertyRepository.findById(id);
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return propertyRepository.findAll();
    }

    @Override
    public LekkiProperty getProperty() {
        return null;
    }
}
