package com.example.demo.dto.response;

import com.example.demo.model.entity.RsuChefMenage;
import com.example.demo.mapper.RsuChefMenageMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class RsuChefMenageResponse {

    private Long id;
    private Long idcs;

    @JsonProperty("firstNameFr")
    private String firstNameFr;
    @JsonProperty("lastNameFr")
    private String lastNameFr;

    @JsonProperty("firstNameAr")
    private String firstNameAr;
    @JsonProperty("lastNameAr")
    private String lastNameAr;

    private String birthDate;

    private Integer maritalStatustId;
    private String gender;
    private Long seuil;
    private Long status;
    private String country;
    private String city;
    private Integer familyMemberCount;
    private Integer houseHoldCount;


    public static RsuChefMenageResponse of(RsuChefMenage rsuChefMenage) {
        return RsuChefMenageMapper.INSTANCE.mapToGetRsuChefMenageResponse(rsuChefMenage);
    }

}
