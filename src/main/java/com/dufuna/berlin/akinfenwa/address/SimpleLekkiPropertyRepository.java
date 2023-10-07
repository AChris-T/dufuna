package com.dufuna.berlin.akinfenwa.address;

import com.dufuna.berlin.akinfenwa.address.model.LekkiProperty;

import java.util.List;

public interface SimpleLekkiPropertyRepository {
    LekkiProperty save(LekkiProperty property);
    LekkiProperty findById(int id);
    List<LekkiProperty> findAll();

    void  update(LekkiProperty property);
}
