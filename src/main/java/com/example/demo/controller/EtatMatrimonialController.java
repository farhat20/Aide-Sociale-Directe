package com.example.demo.controller;

import com.example.demo.dto.response.EtatMatrimonialResponse;
import com.example.demo.service.EtatMatrimonialService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/etatMatrimonial")
public class EtatMatrimonialController {

    private final EtatMatrimonialService etatMatrimonialService;

    public EtatMatrimonialController(EtatMatrimonialService etatMatrimonialService) {this.etatMatrimonialService = etatMatrimonialService; }
    @GetMapping
    public List<EtatMatrimonialResponse> getAllEtatMatrimonial() {return etatMatrimonialService.getAllEtatMatrimonial(); }
}
