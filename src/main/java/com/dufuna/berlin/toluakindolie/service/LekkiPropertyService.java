package com.dufuna.berlin.toluakindolie.service;

import com.dufuna.berlin.toluakindolie.model.LekkiProperty;
/**
 * Interface for managing Lekki properties.
 */
public interface LekkiPropertyService {

    /**
     * Saves a Lekki property.
     *
     * @param property The property to be saved.
     */
    void saveProperty(LekkiProperty property);

    /**
     * Retrieves a single Lekki property.
     *
     * @return A LekkiProperty object.
     */
    LekkiProperty getProperty();
}