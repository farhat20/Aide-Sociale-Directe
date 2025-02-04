package com.example.asd.service.implementation;

import com.example.asd.dto.response.TypeMemberResponse;
import com.example.asd.repository.TypeMemberRepository;
import com.example.asd.service.TypeMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class TypeMemberServiceImpl implements TypeMemberService {

    private final TypeMemberRepository typeMembreRepository;

    @Autowired
    public TypeMemberServiceImpl(TypeMemberRepository typeMembreRepository) {
        this.typeMembreRepository = typeMembreRepository;
    }

    @Override
    public List<TypeMemberResponse> getAllTypeMember() {
        return typeMembreRepository.findAll().stream()
                .map(TypeMemberResponse::of)
                .collect(Collectors.toList());
    }
}
