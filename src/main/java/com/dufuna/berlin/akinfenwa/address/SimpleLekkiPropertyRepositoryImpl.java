package com.dufuna.berlin.akinfenwa.address;

import com.dufuna.berlin.akinfenwa.address.model.LekkiProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleLekkiPropertyRepositoryImpl implements SimpleLekkiPropertyRepository {

    private final Map<Integer,LekkiProperty> propertyMap = new HashMap<>();
    private int nextId = 1;
    @Override
    public LekkiProperty save(LekkiProperty property) {
        int id = nextId ++;
        property.setId(id);
        propertyMap.put(id,property);
        return property;

    }

    @Override
    public LekkiProperty findById(int id) {
        return propertyMap.get(id);
    }

    @Override
    public List<LekkiProperty> findAll() {
        return new ArrayList<>(propertyMap.values());
    }

    @Override
    public void update(LekkiProperty property) {
        int id = property.getId();
        if (propertyMap.containsKey(id)){
            propertyMap.put(id,property);
        }
    }
}
