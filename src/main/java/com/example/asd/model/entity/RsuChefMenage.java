package com.example.asd.model.entity;
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
    private String first_name_ar;
    private String last_name_ar;
    private String birth_date;
    private Integer marital_status_id;
    private String gender;
    private Long seuil;
    private Long status;
    private String country;
    private String city;
    private Integer family_member_count;
    private Integer house_hold_count;
}
