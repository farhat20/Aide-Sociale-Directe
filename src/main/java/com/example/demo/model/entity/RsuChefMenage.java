package com.example.demo.model.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "D_RSU_CHEF_MENAGE_AID")
public class RsuChefMenage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer idcs;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id;}

    public Integer getIdcs() { return idcs; }
    public void setIdcs(Integer idcs) { this.idcs = idcs;}
}
