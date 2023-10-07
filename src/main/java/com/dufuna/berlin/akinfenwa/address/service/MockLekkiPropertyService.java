package com.dufuna.berlin.akinfenwa.address.service;

import com.dufuna.berlin.akinfenwa.address.model.LekkiProperty;

import java.util.List;

public class MockLekkiPropertyService implements LekkiPropertyService{

    @Override
    public LekkiProperty saveProperty(LekkiProperty lekkiProperty) {

        return lekkiProperty;
    }

    @Override
    public LekkiProperty getProperty(int id) {
        return null;
    }

    @Override
    public List<LekkiProperty> getProperties() {
        return null;
    }

    @Override
    public LekkiProperty getProperty() {
        return null;
    }
}
