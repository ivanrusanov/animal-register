package com.ivanrusanov.animalregister.entity;

import org.springframework.data.annotation.Id;

public class Property {

    private final String name;
    private final String value;

    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
