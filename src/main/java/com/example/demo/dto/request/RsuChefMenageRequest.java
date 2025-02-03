package com.example.demo.dto.request;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class RsuChefMenageRequest {
    private Integer id;
    private Long idcs;
    private String firstNameFr;
    private String lastNameFr;
    private String firstNameAr;
    private String lastNameAr;
    private String birthDate;
    private Integer maritalStatusId;


}

