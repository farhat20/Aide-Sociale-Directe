package com.example.asd.controller;

import com.example.asd.dto.response.ApiResponse;
import com.example.asd.dto.response.RsuChefMenageResponse;
import com.example.asd.exception.DomainException;
import com.example.asd.service.RsuChefMenageService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.springframework.http.MediaType;

@CrossOrigin(origins = "*")
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
//    public ResponseEntity<RsuChefMenageResponse> rsuChefMenageByIdcs(@NotNull @PathVariable Long idcs) {
//        // Call the service method and return the response
//        return ResponseEntity.ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(rsuChefMenageService.rsuChefMenageResponse(idcs));  // Correct method
//    }
    public ResponseEntity<ApiResponse<?>> rsuChefMenageByIdcs(@NotNull @PathVariable Long idcs) {
        try {
            return ResponseEntity.ok(new ApiResponse<>(rsuChefMenageService.rsuChefMenageResponse(idcs)));
        } catch (DomainException e) {
            return ResponseEntity.badRequest().body(ApiResponse.of(null, "400", e.getMessage()));
        }
    }
    @GetMapping
    @Operation(summary = "Get all RsuChefMenage records")
    public ResponseEntity<List<RsuChefMenageResponse>> getAllRsuChefMenage() {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(rsuChefMenageService.getAllRsuChefMenage());
    }

}
