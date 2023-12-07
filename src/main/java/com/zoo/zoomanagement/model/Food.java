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
@Table(name = "food")

public class Food {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_food;
    private String name;
    private int protein_g;
    private int carbohydrate_g;
    private int fat_g;
}
