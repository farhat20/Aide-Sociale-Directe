package com.example.asd.dto.response;

import com.example.asd.mapper.TypeAidMapper;
import com.example.asd.model.entity.TypeAid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeAidResponse {
    private Long id;
    private String labelFr;
    private String labelAr;

    public static TypeAidResponse of(TypeAid typeAid) {
        return TypeAidMapper.INSTANCE.mapToGetTypeAidResponse(typeAid);
    }
}
