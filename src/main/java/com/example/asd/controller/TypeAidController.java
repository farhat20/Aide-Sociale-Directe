package com.example.asd.controller;

import com.example.asd.dto.response.TypeAidResponse;
import com.example.asd.service.TypeAidService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/typeAids")
public class TypeAidController {

    private final TypeAidService typeAidService;

    public TypeAidController(TypeAidService typeAidService) {
        this.typeAidService = typeAidService;
    }

    @GetMapping
    public List<TypeAidResponse> getAllTypeAids() {
        return typeAidService.getAllTypeAids();
    }
}
