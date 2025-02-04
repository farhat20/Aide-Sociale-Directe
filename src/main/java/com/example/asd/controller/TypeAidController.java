package com.example.asd.controller;

import com.example.asd.dto.response.TypeAidResponse;
import com.example.asd.service.TypeAidService;
import org.apache.coyote.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<TypeAidResponse>> getAllTypeAids() {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(typeAidService.getAllTypeAid());
    }
}
