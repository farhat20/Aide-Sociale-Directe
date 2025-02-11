package com.example.asd.controller;

import com.example.asd.model.entity.TypeSituation;
import com.example.asd.service.TypeSituationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/typeSituations")
public class TypeSituationController {

    @Autowired
    private TypeSituationService typeSituationService;

    @GetMapping
    public List<TypeSituation> getAllTypeSituations() {
        return typeSituationService.getAllTypeSituations();
    }
}
