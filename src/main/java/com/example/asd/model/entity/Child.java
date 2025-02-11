package com.example.asd.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.DiscriminatorValue;
import lombok.Getter;
import lombok.Setter;

@Entity
@DiscriminatorValue("2")
@Getter
@Setter
public class Child extends RsuMember {
    private Long establishmentTypeId;
    private String establishmentCode;
    private Boolean withDisability;
    private String parentalRelationship;
    private Boolean orphan;
    private String partnerId;
    private String partnerIdType;
}