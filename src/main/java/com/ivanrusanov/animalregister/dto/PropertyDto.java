package com.ivanrusanov.animalregister.dto;

public class PropertyDto {

    private final String name;
    private final String value;

    public PropertyDto(String name, String value) {
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
