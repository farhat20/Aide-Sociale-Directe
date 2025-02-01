package com.example.demo.controller;

import com.example.demo.dto.response.RsuChefMenageResponse;
import com.example.demo.service.RsuChefMenageService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/rsuChefMenage")
//@RequiredArgsConstructor  // Lombok will generate the constructor for us
public class RsuChefMenageController {

    private final RsuChefMenageService rsuChefMenageService;  // The service to be injected
    @Autowired
    public RsuChefMenageController(RsuChefMenageService rsuChefMenageService) {
        this.rsuChefMenageService = rsuChefMenageService;
    }

    @GetMapping("/{idcs}")
    @Operation(summary = "Get user detail by IDCS")
    public ResponseEntity<RsuChefMenageResponse> rsuChefMenageByIdcs(@PathVariable Long idcs) {
        // Call the service method and return the response
        return ResponseEntity.ok(rsuChefMenageService.rsuChefMenageResponse(idcs));  // Correct method
    }

    @GetMapping
    @Operation(summary = "Get all RsuChefMenage records")
    public ResponseEntity<List<RsuChefMenageResponse>> getAllRsuChefMenage() {
        return ResponseEntity.ok(rsuChefMenageService.getAllRsuChefMenage());
    }

}
