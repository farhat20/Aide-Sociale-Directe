package com.example.asd.model.entity;

import com.example.asd.validation.ValidIdcs;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "D_RSU_MEMBRE_FAMILLE_AID")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)  // Une seule table pour RsuMember et Child
@DiscriminatorColumn(name = "member_type", discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("1")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RsuMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ValidIdcs
    @Column(nullable = false, unique = true)
    private Long idcs;

    private String first_name_fr;
    private String last_name_fr;
    private String first_name_ar;
    private String last_name_ar;
    private String birth_date;

    @ManyToOne
    @JoinColumn(name = "marital_status_id", referencedColumnName = "id")
    private EtatMatrimonial etatMatrimonial;

    private String gender;
    private Long seuil;
    private Long status;
    private String country;
    private String city;
    private Integer family_member_count;
    private Integer house_hold_code;
    private String cin;
}


