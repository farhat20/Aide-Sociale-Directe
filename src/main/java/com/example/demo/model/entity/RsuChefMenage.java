package com.example.demo.model.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "D_RSU_CHEF_MENAGE_AID")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class RsuChefMenage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private Long idcs;

    private String first_name_fr;
    private String last_name_fr;
}
