package com.dufuna.berlin.akinfenwa.address.service;

import com.dufuna.berlin.akinfenwa.address.model.LekkiProperty;

import java.util.List;

public interface LekkiPropertyService {
    LekkiProperty saveProperty(LekkiProperty lekkiProperty);
    LekkiProperty getProperty( int id);

    List<LekkiProperty> getProperties();

    LekkiProperty getProperty();
}
