package com.dufuna.berlin.toluakindolie;

import com.dufuna.berlin.toluakindolie.model.LekkiProperty;
import com.dufuna.berlin.toluakindolie.service.LekkiPropertyService;
import com.dufuna.berlin.toluakindolie.service.MockLekkiPropertyService;

import java.time.LocalDate;

/**
 * Main application class for demonstrating the MockLekkiPropertyService functionality.
 */
public class MockLekkiPropertyApp {
    public static void main(String[] args) {
        // Create a LekkiProperty
        LekkiProperty property = new LekkiProperty(
                1,
                "123 Ibeju Lekki Way, Lagos",
                "House",
                3,
                2,
                1,
                2,
                3,
                "John Doe",
                "A beautiful house with modern amenities.",
                LocalDate.of(2024, 1, 1),
                LocalDate.of(2024, 12, 31)
        );

        // Create an instance of LekkiPropertyService
        LekkiPropertyService service = new MockLekkiPropertyService();

        // Save the property using LekkiPropertyService
        service.saveProperty(property);

        // Get the property using LekkiPropertyService
        LekkiProperty retrievedProperty = service.getProperty();

        // Print the retrieved property
        System.out.println("Retrieved Property: " + retrievedProperty);
    }
}
