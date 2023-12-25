package com.zoo.zoomanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.zoomanagement.model.Animal;
import com.zoo.zoomanagement.repository.AnimalRepository;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository repository;
    
    // add animal
    public Animal saveAnimal(Animal animal){
        return repository.save(animal);
    }

    // get all animal
    public List<Animal> findAllAnimal(){
        return repository.findAll();
    }

    // get animal by enclosure id
    public List<Animal> findAllAnimalByEnclosureId(int id){
        return repository.findByIdEnclosure(id);
    }

    // delete animal by id
    public String deleteAnimalById(int id){
        repository.deleteById(id);
        return id + " Animal Removed";
    }

    // upgrade animal
    public Animal updateAnimal(Animal animal){
        Animal existing=repository.findById(animal.getId_animal()).orElse(null);
        existing.setId_animal_type(animal.getId_animal_type());
        existing.setIdEnclosure(animal.getIdEnclosure());
        existing.setId_status(animal.getId_status());
        existing.setId_zoo(animal.getId_zoo());
        existing.setImg_url(animal.getImg_url());
        existing.setIntroduction(animal.getIntroduction());
        existing.setName(animal.getName());
        existing.setNofication(animal.getNofication());
        return repository.save(existing);
    }
}
