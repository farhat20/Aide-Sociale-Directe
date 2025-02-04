package com.example.asd.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "P_TYPE_SITUATION")
public class TypeSituation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String label_fr;

    private String label_ar;

    // Default constructor
    public TypeSituation() {}

    // Parameterized constructor (optional)
    public TypeSituation(String labelFr, String labelAr) {
        this.label_fr = labelFr;
        this.label_ar = labelAr;
    }

    // Getters and Setters
    public Integer getId() { return id; }

    public String getLabelFr() { return label_fr; }

    public String getLabelAr() { return label_ar; }
}

