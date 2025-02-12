package com.example.asd.controller;

import com.example.asd.dto.response.ApiResponse;
import com.example.asd.dto.response.TypeAidResponse;
import com.example.asd.exception.DomainException;
import com.example.asd.service.TypeAidService;
import jakarta.validation.constraints.NotNull;
import org.apache.coyote.Response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity<ApiResponse<?>> getAllTypeAids() {
        try {
            return ResponseEntity.ok(new ApiResponse<>(typeAidService.getAllTypeAid()));
        } catch (DomainException e) {
            return ResponseEntity.badRequest().body(ApiResponse.of(null, "400", e.getMessage()));
        }
    }

//    public ResponseEntity<List<TypeAidResponse>> getAllTypeAids() {
//        return ResponseEntity.ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(typeAidService.getAllTypeAid());
//    }
}
