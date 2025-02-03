package com.example.asd.service.implementation;

import com.example.asd.dto.response.EtatMatrimonialResponse;
import com.example.asd.repository.EtatMatrimonialRepository;
import com.example.asd.service.EtatMatrimonialService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class EtatMatrimonialServiceImpl implements EtatMatrimonialService {

    private final EtatMatrimonialRepository etatMatrimonialRepository;
    @Autowired
    public EtatMatrimonialServiceImpl(EtatMatrimonialRepository etatMatrimonialRepository) {
        this.etatMatrimonialRepository = etatMatrimonialRepository;
    }

    @Override
    public List<EtatMatrimonialResponse> getAllEtatMatrimonial() {
        return etatMatrimonialRepository.findAll().stream()
                .map(EtatMatrimonialResponse::of)
                .collect(Collectors.toList());
    }
}

