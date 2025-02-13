package com.example.asd.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.relational.core.sql.In;

@Entity
@Table(name = "P_TYPE_AID")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class TypeAid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String label_fr;
    private String label_ar;


}
