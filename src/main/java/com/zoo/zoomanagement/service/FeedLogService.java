package com.zoo.zoomanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.zoomanagement.model.FeedLog;
import com.zoo.zoomanagement.repository.FeedLogRepository;

@Service
public class FeedLogService {
    @Autowired
    private FeedLogRepository repository;
    
    public FeedLog saveFeedLog(FeedLog feed_log){
        return repository.save(feed_log);
    }

    public List<FeedLog> findAllFeedLogByAnimalId(int id){
        return repository.findByIdAnimal(id);
    }
}
