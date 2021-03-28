package com.ivanrusanov.animalregister.dto;

public class AnimalDto {

    private final PropertyDto[] properties;

    public AnimalDto(PropertyDto[] properties) {
        this.properties = properties;
    }

    public PropertyDto[] getProperties() {
        return properties;
    }
}
