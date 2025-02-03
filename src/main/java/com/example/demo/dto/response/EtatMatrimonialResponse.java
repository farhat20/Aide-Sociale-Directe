package com.example.demo.dto.response;

import com.example.demo.mapper.EtatMatrimonialMapper;
import com.example.demo.model.entity.EtatMatrimonial;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EtatMatrimonialResponse {

    private Integer id;

    private String labelFr;
    private String labelAr;


    public static EtatMatrimonialResponse of(EtatMatrimonial etatMatrimonial) {
        return EtatMatrimonialMapper.INSTANCE.mapToGetEtatMatrimonialResponse(etatMatrimonial);
    }

}
