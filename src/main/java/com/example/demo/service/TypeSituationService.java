package com.example.demo.service;

import com.example.demo.model.entity.TypeSituation;
import com.example.demo.repository.TypeSituationRepository;
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
