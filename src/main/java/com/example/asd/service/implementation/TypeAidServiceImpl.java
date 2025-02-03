package com.example.asd.service.implementation;

import com.example.asd.dto.response.TypeAidResponse;
import com.example.asd.model.entity.TypeAid;
import com.example.asd.repository.TypeAidRepository;
import com.example.asd.service.TypeAidService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TypeAidServiceImpl implements TypeAidService {

    private final TypeAidRepository typeAidRepository;

    public TypeAidServiceImpl(TypeAidRepository typeAidRepository) {
        this.typeAidRepository = typeAidRepository;
    }

    @Override
    public List<TypeAidResponse> getAllTypeAids() {
        return typeAidRepository.findAll()
                .stream()
                .map(this::mapToResponse) // Manual mapping method
                .collect(Collectors.toList());
    }

    // Manual Mapping Method (Instead of ModelMapper)
    private TypeAidResponse mapToResponse(TypeAid typeAid) {
        TypeAidResponse response = new TypeAidResponse();
        response.setId(typeAid.getId());
        response.setName(typeAid.getName());
        response.setDescription(typeAid.getDescription());
        return response;
    }
}
