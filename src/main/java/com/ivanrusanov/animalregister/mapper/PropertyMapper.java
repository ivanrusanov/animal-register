package com.ivanrusanov.animalregister.mapper;

import com.ivanrusanov.animalregister.dto.PropertyDto;
import com.ivanrusanov.animalregister.entity.Property;
import org.springframework.stereotype.Component;

@Component
public class PropertyMapper implements Mapper<Property, PropertyDto> {

    @Override
    public Property toEntity(PropertyDto dto) {
        return new Property(dto.getName(), dto.getDescription());
    }

    @Override
    public PropertyDto toDto(Property entity) {
        return new PropertyDto(entity.getName(), entity.getDescription());
    }
}
