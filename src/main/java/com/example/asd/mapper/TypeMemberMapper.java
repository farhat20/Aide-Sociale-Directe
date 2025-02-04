package com.example.asd.mapper;

import com.example.asd.dto.response.TypeMemberResponse;
import com.example.asd.model.entity.TypeMember;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TypeMemberMapper {

    TypeMemberMapper INSTANCE = Mappers.getMapper(TypeMemberMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "labelFr", source = "label_fr")
    @Mapping(target = "labelAr", source = "label_ar")
    TypeMemberResponse mapToGetTypeMemberResponse(TypeMember entity);
}
