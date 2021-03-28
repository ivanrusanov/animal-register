package com.ivanrusanov.animalregister.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "animals")
public class Animal {

    @Id
    private long id;
    private final Property[] properties;

    public Animal(Property[] properties) {
        this.properties = properties;
    }

    public long getId() {
        return id;
    }

    public Property[] getProperties() {
        return properties;
    }
}
