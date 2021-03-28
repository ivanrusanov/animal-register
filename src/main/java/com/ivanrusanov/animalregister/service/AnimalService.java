package com.ivanrusanov.animalregister.service;

import com.ivanrusanov.animalregister.entity.Animal;
import com.ivanrusanov.animalregister.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    private final AnimalRepository repository;

    @Autowired
    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public void addAnimal(Animal animal) {
        repository.insert(animal);
    }
}
