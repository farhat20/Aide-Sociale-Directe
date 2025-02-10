package com.example.asd.mapper;

import com.example.asd.dto.response.RsuChefMenageResponse;
import com.example.asd.model.entity.RsuChefMenage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RsuChefMenageMapper {

    RsuChefMenageMapper INSTANCE = Mappers.getMapper(RsuChefMenageMapper.class);

    @Mapping(target = "idcs", source = "idcs")
    @Mapping(target = "firstNameFr", source = "first_name_fr")
    @Mapping(target = "lastNameFr", source = "last_name_fr")
    @Mapping(target = "firstNameAr", source = "first_name_ar")
    @Mapping(target = "lastNameAr", source = "last_name_ar")
    @Mapping(target = "birthDate", source = "birth_date")

    @Mapping(target = "labelFr", source = "etatMatrimonial.label_fr")
    @Mapping(target = "labelAr", source = "etatMatrimonial.label_ar")

    @Mapping(target = "gender", source = "gender")
    @Mapping(target = "seuil", source = "seuil")
    @Mapping(target = "status", source = "status")
    @Mapping(target = "country", source = "country")
    @Mapping(target = "city", source = "city")
    @Mapping(target = "familyMemberCount", source = "family_member_count")
    @Mapping(target = "houseHoldCode", source = "house_hold_code")
    @Mapping(target = "cin", source = "cin")

    RsuChefMenageResponse mapToGetRsuChefMenageResponse(RsuChefMenage entity);
}
