package com.example.asd.mapper;

import com.example.asd.dto.response.RsuChefMenageResponse;
import com.example.asd.model.entity.RsuChefMenage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RsuChefMenageMapper {

    RsuChefMenageMapper INSTANCE = Mappers.getMapper(RsuChefMenageMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "idcs", source = "idcs")
    @Mapping(target = "firstNameFr", source = "first_name_fr")
    @Mapping(target = "lastNameFr", source = "last_name_fr")
    @Mapping(target = "firstNameAr", source = "first_name_ar")
    @Mapping(target = "lastNameAr", source = "last_name_ar")
    @Mapping(target = "birthDate", source = "birth_date")
    RsuChefMenageResponse mapToGetRsuChefMenageResponse(RsuChefMenage entity);
}
