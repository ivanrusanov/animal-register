package com.ivanrusanov.animalregister.dto;

import java.util.HashMap;
import java.util.Map;

public class AnimalDto {

    private final String name;
    private final Map<String, String> properties;

    public AnimalDto(String name, Map<String, String> properties) {
        this.name = name;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public Map<String, String> getProperties() {
        return properties;
    }
}
