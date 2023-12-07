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
@Table(name = "enclosure")

public class Enclosure {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_enclosure;
    private int id_zoo;
    private String name;
    private String introduce;
}
