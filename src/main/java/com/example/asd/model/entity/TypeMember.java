package com.example.asd.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "P_TYPE_MEMBER")
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class TypeMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String label_fr;
    private String label_ar;
}
