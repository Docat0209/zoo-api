package com.zoo.zoomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoo.zoomanagement.model.Food;

public interface FoodRepository extends JpaRepository<Food,Integer>{
    
}
