package com.example.asd.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "P_TYPE_SITUATION", schema = "asd")
public class TypeSituation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "label_fr") // Ensure column names match exactly
    private String labelFr;

    @Column(name = "label_ar")
    private String labelAr;

    // Default constructor
    public TypeSituation() {}

    // Parameterized constructor (optional)
    public TypeSituation(String labelFr, String labelAr) {
        this.labelFr = labelFr;
        this.labelAr = labelAr;
    }

    // Getters and Setters
    public Integer getId() { return id; }

    public String getLabelFr() { return labelFr; }

    public String getLabelAr() { return labelAr; }
}

