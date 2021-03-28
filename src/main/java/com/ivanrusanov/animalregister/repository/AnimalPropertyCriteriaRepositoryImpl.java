package com.ivanrusanov.animalregister.repository;

import com.ivanrusanov.animalregister.entity.Animal;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class AnimalPropertyCriteriaRepositoryImpl implements AnimalPropertyCriteriaRepository {

    private final MongoTemplate mongoTemplate;

    public AnimalPropertyCriteriaRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public List<Animal> findByPropertyCriteria(Criteria criteria) {
        Query query = new Query();
        query.addCriteria(Criteria.where("properties").elemMatch(criteria));
        return mongoTemplate.find(query, Animal.class);
    }
}
