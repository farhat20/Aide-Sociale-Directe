package com.example.asd.dto.response;

import com.example.asd.model.entity.RsuChefMenage;
import com.example.asd.mapper.RsuChefMenageMapper;
//import com.example.asd.validation.ValidIdcsChefMenage;
import com.example.asd.validation.ValidIdcs;
import com.example.asd.validation.ValidIdcsBeneficiaryFamily;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)

public class RsuChefMenageResponse {

    @Id
    private Long id;
    @ValidIdcsBeneficiaryFamily
    private Long idcs;

//    @JsonProperty("firstNameFr")
    private String firstNameFr;
//    @JsonProperty("lastNameFr")
    private String lastNameFr;

//    @JsonProperty("firstNameAr")
    private String firstNameAr;
//    @JsonProperty("lastNameAr")
    private String lastNameAr;

    private String birthDate;

    private String labelAr;
    private String labelFr;

    private String gender;
    private Long seuil;
    private Long status;
    private String country;
    private String city;
    private Integer familyMemberCount;
    private Integer houseHoldCode;
    private String cin;

    public static RsuChefMenageResponse of(RsuChefMenage rsuChefMenage) {
        return RsuChefMenageMapper.INSTANCE.mapToGetRsuChefMenageResponse(rsuChefMenage);
    }

}
