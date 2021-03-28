package com.ivanrusanov.animalregister.entity;

import org.springframework.data.annotation.Id;

public class Property {

    @Id
    private final String name;
    private final String description;

    public Property(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
