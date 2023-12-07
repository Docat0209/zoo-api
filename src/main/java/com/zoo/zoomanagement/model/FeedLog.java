package com.zoo.zoomanagement.model;

import jakarta.persistence.Column;
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
@Table(name = "feed_log")

public class FeedLog {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_feed_log;
    private int id_food;
    @Column(name="id_animal")
    private int idAnimal;    
    private String time;
}
