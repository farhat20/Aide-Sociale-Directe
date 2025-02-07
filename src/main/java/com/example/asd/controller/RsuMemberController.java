package com.example.asd.controller;

import com.example.asd.dto.response.ApiResponse;
import com.example.asd.dto.response.RsuMemberResponse;
import com.example.asd.exception.DomainException;
import com.example.asd.service.RsuMemberService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rsuMember")
public class RsuMemberController {

    private final RsuMemberService rsuMemberService;

    @Autowired
    public RsuMemberController(RsuMemberService rsuMemberService) {
        this.rsuMemberService = rsuMemberService;
    }

    @GetMapping("/{idcs}")
    @Operation(summary = "Get user detail by IDCS")
//    public ResponseEntity<RsuMemberResponse> rsuMemberByIdcs(@NotNull @PathVariable Long idcs) {
//        return ResponseEntity.ok()
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(rsuMemberService.rsuMemberResponse(idcs));
//    }
    public ResponseEntity<ApiResponse<?>> rsuMemberByIdcs(@NotNull @PathVariable Long idcs) {
        try {
            return ResponseEntity.ok(new ApiResponse<>(rsuMemberService.rsuMemberResponse(idcs)));
        } catch (DomainException e) {
            return ResponseEntity.badRequest().body(ApiResponse.of(null, "400", e.getMessage()));
        }
    }

    @GetMapping
    @Operation(summary = "Get all RsuMember records")
    public ResponseEntity<List<RsuMemberResponse>> getAllRsuMember() {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(rsuMemberService.getAllRsuMember());
    }
}
