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
@Table(name = "animal")

public class Animal {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id_animal;
    private int id_animal_type;
    private int id_zoo;
    @Column(name = "id_enclosure")
    private int idEnclosure;
    private int id_status;
    private String name;
    private String introduction;
    private String nofication;
    private String img_url;
}
