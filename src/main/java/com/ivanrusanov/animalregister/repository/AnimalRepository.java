package com.ivanrusanov.animalregister.repository;

import com.ivanrusanov.animalregister.entity.Animal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends MongoRepository<Animal, Long> {
}
