package com.ivanrusanov.animalregister.mapper;

import com.ivanrusanov.animalregister.dto.AnimalDto;
import com.ivanrusanov.animalregister.entity.Animal;
import org.springframework.stereotype.Component;

@Component
public class AnimalMapper implements Mapper<Animal, AnimalDto> {

    @Override public Animal toEntity(AnimalDto dto) {
        return new Animal(dto.getName(), dto.getProperties());
    }

    @Override public AnimalDto toDto(Animal entity) {
        return new AnimalDto(entity.getName(), entity.getProperties());
    }
}
