package com.zoo.zoomanagement.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zoo.zoomanagement.model.Enclosure;
import com.zoo.zoomanagement.service.EnclosureService;

@RestController
public class EnclosureController {
    @Autowired
    private EnclosureService service;

    // get all enclosure
    @GetMapping("/enclosure")
    public HashMap<String,List<Enclosure>> getAllEnclosure(){
        HashMap<String,List<Enclosure>> map = new HashMap<>();
        map.put("data", service.findAllEnclosure());
        return map;
    }

    // add enclosure
    @PostMapping("/enclosure/add")
    public Enclosure addEnclosure(@RequestBody Enclosure enclosure){
        return service.saveEnclosure(enclosure);
    }
    
    // update enclosure
    @PutMapping("/enclosure/update")
    public Enclosure updateEnclosure(@RequestBody Enclosure enclosure) {
        return service.updateEnclosure(enclosure);
    }

    // delete enclosure
    @DeleteMapping("/enclosure/delete/{id}")
    public String deleteEnclosureById(@PathVariable int id) {
        return service.deleteEnclosureById(id);
    }
}
