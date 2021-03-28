package com.ivanrusanov.animalregister.service;

import com.github.rutledgepaulv.qbuilders.builders.GeneralQueryBuilder;
import com.github.rutledgepaulv.qbuilders.conditions.Condition;
import com.github.rutledgepaulv.qbuilders.visitors.MongoVisitor;
import com.github.rutledgepaulv.rqe.pipes.QueryConversionPipeline;
import com.ivanrusanov.animalregister.entity.Animal;
import com.ivanrusanov.animalregister.entity.Property;
import com.ivanrusanov.animalregister.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository repository;
    private final QueryConversionPipeline pipeline = QueryConversionPipeline.defaultPipeline();

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

    public List<Animal> findByProperties(String queryString) {
        Condition<GeneralQueryBuilder> condition = pipeline.apply(queryString, Property.class);
        Criteria criteria = condition.query(new MongoVisitor());
        return repository.findByPropertyCriteria(criteria);
    }
}
