package com.zoo.zoomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zoo.zoomanagement.model.Animal;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal,Integer>{
    
    List<Animal> findByIdEnclosure(int idEnclosure);

}