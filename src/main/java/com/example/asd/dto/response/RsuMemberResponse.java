package com.example.asd.dto.response;

import com.example.asd.mapper.RsuMemberMapper;
import com.example.asd.model.entity.RsuMember;
import com.example.asd.validation.ValidIdcs;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RsuMemberResponse {

    @Id
    private Long id;
    @ValidIdcs
    private Long idcs;

    private String firstNameFr;
    private String lastNameFr;

    private String firstNameAr;
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

    public static RsuMemberResponse of(RsuMember rsuMember) {
        return RsuMemberMapper.INSTANCE.mapToGetRsuMemberResponse(rsuMember);
    }
}
