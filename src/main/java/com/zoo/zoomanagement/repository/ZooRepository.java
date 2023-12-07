package com.zoo.zoomanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoo.zoomanagement.model.Zoo;

public interface ZooRepository extends JpaRepository<Zoo,Integer>{
    
}
