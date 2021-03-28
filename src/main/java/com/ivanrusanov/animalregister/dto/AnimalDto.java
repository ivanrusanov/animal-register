package com.ivanrusanov.animalregister.dto;

public class AnimalDto {

    private final String name;
    private final PropertyDto[] properties;

    public AnimalDto(String name, PropertyDto[] properties) {
        this.name = name;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public PropertyDto[] getProperties() {
        return properties;
    }
}
