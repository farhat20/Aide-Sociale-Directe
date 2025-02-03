package com.example.asd.service;

import com.example.asd.model.entity.TypeSituation;
import com.example.asd.repository.TypeSituationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TypeSituationService {

    @Autowired
    private TypeSituationRepository TypeSituationRepository;

    public List<TypeSituation> getAllTypeSituations() {
        return TypeSituationRepository.findAll();
    }
}
