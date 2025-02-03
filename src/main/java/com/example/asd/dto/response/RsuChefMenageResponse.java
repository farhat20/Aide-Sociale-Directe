package com.example.asd.dto.response;

import com.example.asd.model.entity.RsuChefMenage;
import com.example.asd.mapper.RsuChefMenageMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class RsuChefMenageResponse {

    private Integer id;
    private Long idcs;

    @JsonProperty("first_name_fr")
    private String firstNameFr;
    @JsonProperty("last_name_fr")
    private String lastNameFr;

    @JsonProperty("first_name_ar")
    private String firstNameAr;
    @JsonProperty("last_name_ar")
    private String lastNameAr;

    private String birthDate;

    public static RsuChefMenageResponse of(RsuChefMenage rsuChefMenage) {
        return RsuChefMenageMapper.INSTANCE.mapToGetRsuChefMenageResponse(rsuChefMenage);
    }

}
