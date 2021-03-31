package com.ivanrusanov.animalregister.service;

import com.ivanrusanov.animalregister.entity.Animal;
import com.ivanrusanov.animalregister.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<Animal> findAll() {
        return repository.findAll();
    }

    // "properties['type'] == 'herbivore' && properties['weight'] != 'medium'"
    public List<Animal> findByProperties(String queryString) {
        ExpressionParser parser = new SpelExpressionParser();
        List<Animal> selected = new ArrayList<>();
        for(Animal animal : findAll()) {
            Expression parsedExpression = parser.parseExpression(queryString);
            Boolean value = (Boolean) parsedExpression.getValue(animal);
            if (value != null && value) {
                selected.add(animal);
            }
        }
        return selected;
    }
}
