package com.zoo.zoomanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoo.zoomanagement.model.Enclosure;
import com.zoo.zoomanagement.repository.EnclosureRepository;

@Service
public class EnclosureService {
    @Autowired
    private EnclosureRepository repository;
    
    // add enclosure
    public Enclosure saveEnclosure(Enclosure enclosure){
        return repository.save(enclosure);
    }

    // get all enclosure
    public List<Enclosure> findAllEnclosure(){
        return repository.findAll();
    }

    // delete enclosure
    public String deleteEnclosureById(int id){
        repository.deleteById(id);
        return id + " Enclosure Removed";
    }

    // update enclosure
    public Enclosure updateEnclosure(Enclosure enclosure){
        Enclosure existing=repository.findById(enclosure.getId_enclosure()).orElse(null);
        existing.setId_zoo(enclosure.getId_zoo());
        existing.setIntroduce(enclosure.getIntroduce());
        existing.setName(enclosure.getName());
        return repository.save(existing);
    }
}
