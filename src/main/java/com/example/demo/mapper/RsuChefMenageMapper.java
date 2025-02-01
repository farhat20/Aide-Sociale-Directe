package com.example.demo.mapper;

import com.example.demo.dto.response.RsuChefMenageResponse;
import com.example.demo.model.entity.RsuChefMenage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RsuChefMenageMapper {

    RsuChefMenageMapper INSTANCE = Mappers.getMapper(RsuChefMenageMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "idcs", source = "idcs")
    @Mapping(target = "first_name_fr", source = "first_name_fr")
    @Mapping(target = )
    RsuChefMenageResponse mapToGetRsuChefMenageResponse(RsuChefMenage entity);
}
