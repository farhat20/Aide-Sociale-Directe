package com.example.asd.dto.response;

import com.example.asd.mapper.TypeMemberMapper;
import com.example.asd.model.entity.TypeMember;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeMemberResponse {

    private Integer id;
    private String labelFr;
    private String labelAr;

    public static TypeMemberResponse of(TypeMember typeMember) {
        return TypeMemberMapper.INSTANCE.mapToGetTypeMemberResponse(typeMember);
    }
}
