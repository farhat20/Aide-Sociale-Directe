package com.example.asd.mapper;

import com.example.asd.dto.response.TypeAidResponse;
import com.example.asd.model.entity.TypeAid;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TypeAidMapper {

    TypeAidMapper INSTANCE = Mappers.getMapper(TypeAidMapper.class);

//    @Mapping(target = "id", source = "id")
    @Mapping(target = "labelFr", source = "label_fr")
    @Mapping(target = "labelAr", source = "label_ar")
    TypeAidResponse mapToGetTypeAidResponse(TypeAid entity);
}
