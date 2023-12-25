package com.zoo.zoomanagement.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zoo.zoomanagement.model.Animal;
import com.zoo.zoomanagement.service.AnimalService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class AnimalController {
    
    @Autowired
    private AnimalService service;

    // get all animal
    @CrossOrigin
    @GetMapping("/animal")
    public HashMap<String,List<Animal>> getAllAnimal(){
        HashMap<String,List<Animal>> map = new HashMap<>();
        map.put("data", service.findAllAnimal());
        return map;
    }

    // get animal by enclosure id
    @GetMapping("/animal/enclosure/{id}")
    public HashMap<String,List<Animal>> getAllAnimalByEnclosureId(@PathVariable int id){
        HashMap<String,List<Animal>> map = new HashMap<>();
        map.put("data", service.findAllAnimalByEnclosureId(id));
        return map;
    }

    // add animal
    @PostMapping("/animal/add")
    public Animal addAnimal(@RequestBody Animal animal){
        return service.saveAnimal(animal);
    }
    
    // update animal
    @PutMapping("/animal/update")
    public Animal updateAnimal(@RequestBody Animal animal) {
        return service.updateAnimal(animal);
    }

    // delete animal
    @DeleteMapping("/animal/delete/{id}")
    public String deleteAnimalById(@PathVariable int id) {
        return service.deleteAnimalById(id);
    }
}
