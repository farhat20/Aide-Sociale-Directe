package com.example.demo.mapper;

import com.example.demo.dto.response.EtatMatrimonialResponse;
import com.example.demo.model.entity.EtatMatrimonial;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EtatMatrimonialMapper {

    EtatMatrimonialMapper INSTANCE = Mappers.getMapper(EtatMatrimonialMapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "labelFr", source = "label_fr")
    @Mapping(target = "labelAr", source = "label_ar")
    EtatMatrimonialResponse mapToGetEtatMatrimonialResponse(EtatMatrimonial etatMatrimonial);
}
