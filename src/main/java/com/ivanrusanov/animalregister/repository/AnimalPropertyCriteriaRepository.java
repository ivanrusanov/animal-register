package com.ivanrusanov.animalregister.repository;

import com.ivanrusanov.animalregister.entity.Animal;
import org.springframework.data.mongodb.core.query.Criteria;

import java.util.List;

public interface AnimalPropertyCriteriaRepository {
    List<Animal> findByPropertyCriteria(Criteria criteria);
}
