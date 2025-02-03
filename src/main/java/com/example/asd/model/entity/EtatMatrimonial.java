package com.example.asd.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "P_ETAT_MATRIMONIAL")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class EtatMatrimonial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String label_fr;
    private String label_ar;

}
