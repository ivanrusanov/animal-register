package com.ivanrusanov.animalregister.mapper;

import com.ivanrusanov.animalregister.dto.AnimalDto;
import com.ivanrusanov.animalregister.dto.PropertyDto;
import com.ivanrusanov.animalregister.entity.Animal;
import com.ivanrusanov.animalregister.entity.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AnimalMapper implements Mapper<Animal, AnimalDto> {

    private final PropertyMapper propertyMapper;

    @Autowired
    public AnimalMapper(PropertyMapper propertyMapper) {
        this.propertyMapper = propertyMapper;
    }

    @Override public Animal toEntity(AnimalDto dto) {
        return new Animal(
                Arrays.stream(dto.getProperties())
                        .map(propertyMapper::toEntity)
                        .toArray(Property[]::new)
        );
    }

    @Override public AnimalDto toDto(Animal entity) {
        return new AnimalDto(
                Arrays.stream(entity.getProperties())
                        .map(propertyMapper::toDto)
                        .toArray(PropertyDto[]::new));
    }
}
