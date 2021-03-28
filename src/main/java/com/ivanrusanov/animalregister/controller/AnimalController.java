package com.ivanrusanov.animalregister.controller;

import com.ivanrusanov.animalregister.dto.AnimalDto;
import com.ivanrusanov.animalregister.mapper.AnimalMapper;
import com.ivanrusanov.animalregister.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    private final AnimalService service;
    private final AnimalMapper animalMapper;

    @Autowired
    public AnimalController(AnimalService service, AnimalMapper animalMapper) {
        this.service = service;
        this.animalMapper = animalMapper;
    }

    @PostMapping(path = "animal/insert")
    public void insert(@RequestBody AnimalDto animalDto) {
        service.addAnimal(animalMapper.toEntity(animalDto));
    }
}
