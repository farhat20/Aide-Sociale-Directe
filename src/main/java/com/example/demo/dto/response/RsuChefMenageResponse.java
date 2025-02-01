package com.example.demo.dto.response;

import com.example.demo.model.entity.RsuChefMenage;
import com.example.demo.mapper.RsuChefMenageMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)

public class RsuChefMenageResponse {

    private Integer id;
    private Long idcs;
    private String first_name_fr;
    private String last_name_fr;

    public static RsuChefMenageResponse of(RsuChefMenage rsuChefMenage) {
        return RsuChefMenageMapper.INSTANCE.mapToGetRsuChefMenageResponse(rsuChefMenage);
    }

}
