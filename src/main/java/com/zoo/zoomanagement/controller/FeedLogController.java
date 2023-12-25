package com.zoo.zoomanagement.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zoo.zoomanagement.model.FeedLog;
import com.zoo.zoomanagement.service.FeedLogService;

@RestController
public class FeedLogController {
    @Autowired
    private FeedLogService service;

    // get feedlog by animal id
    @GetMapping("/feedLog/animal/{id}")
    public HashMap<String,List<FeedLog>> getAllFeedLog(@PathVariable int id){
        HashMap<String,List<FeedLog>> map = new HashMap<>();
        map.put("data", service.findAllFeedLogByAnimalId(id));
        return map;
    }

    // add feedlog
    @PostMapping("/feedLog/add")
    public FeedLog addFeedLog(@RequestBody FeedLog feed_log){
        return service.saveFeedLog(feed_log);
    }
}
