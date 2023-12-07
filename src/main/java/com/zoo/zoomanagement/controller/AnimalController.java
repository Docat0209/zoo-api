package com.zoo.zoomanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/animal")
    public List<Animal> getAllAnimal(){
        return service.findAllAnimal();
    }

    @GetMapping("/animal/enclosure/{id}")
    public List<Animal> getAllAnimalByEnclosureId(@PathVariable int id){
        return service.findAllAnimalByEnclosureId(id);
    }


    @PostMapping("/animal/add")
    public Animal addAnimal(@RequestBody Animal animal){
        return service.saveAnimal(animal);
    }
    
    @PutMapping("/animal/update")
    public Animal updateAnimal(@RequestBody Animal animal) {
        return service.updateAnimal(animal);
    }

    @DeleteMapping("/animal/delete/{id}")
    public String deleteAnimalById(@PathVariable int id) {
        return service.deleteAnimalById(id);
    }
}
