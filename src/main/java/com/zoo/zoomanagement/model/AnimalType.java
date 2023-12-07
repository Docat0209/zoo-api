package com.zoo.zoomanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "animal_type")

public class AnimalType {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_animal_type;
    private String class_name;
    private String order_name;
}
