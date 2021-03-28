package com.ivanrusanov.animalregister.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "animals")
public class Animal {

    @Id
    private final String name;
    private final Property[] properties;

    public Animal(String name, Property[] properties) {
        this.name = name;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public Property[] getProperties() {
        return properties;
    }
}
