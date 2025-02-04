package com.example.asd.service.implementation;

import com.example.asd.dto.response.TypeAidResponse;
import com.example.asd.repository.TypeAidRepository;
import com.example.asd.service.TypeAidService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class TypeAidServiceImpl implements TypeAidService {

    private final TypeAidRepository typeAidRepository;

    @Autowired
    public TypeAidServiceImpl(TypeAidRepository typeAidRepository) {

        this.typeAidRepository = typeAidRepository;
    }

    @Override
    public List<TypeAidResponse> getAllTypeAid() {
        return typeAidRepository.findAll().stream()
                .map(TypeAidResponse::of)
                .collect(Collectors.toList());
    }

}
