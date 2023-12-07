package com.zoo.zoomanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoo.zoomanagement.model.FeedLog;

public interface FeedLogRepository extends JpaRepository<FeedLog,Integer>{
    
    List<FeedLog> findByIdAnimal(int idAnimal);
}