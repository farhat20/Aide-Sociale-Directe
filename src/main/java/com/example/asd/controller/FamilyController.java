package com.example.asd.controller;

import com.example.asd.dto.response.ApiResponse;
import com.example.asd.dto.response.FamilyResponse;
import com.example.asd.exception.DomainException;
import com.example.asd.service.FamilyService;
import com.example.asd.service.MemberService;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/family")
@RequiredArgsConstructor
public class FamilyController {

    private final MemberService memberService;

    @GetMapping("/{idcs}")
    public ResponseEntity<ApiResponse<?>> rsuMemberByIdcs(@NotNull @PathVariable Long idcs) {
        try {
            FamilyResponse response = memberService.getMemberData(idcs);
            return ResponseEntity.ok(new ApiResponse<>(response));
        } catch (DomainException e) {
            return ResponseEntity.badRequest().body(ApiResponse.of(null, "400", e.getMessage()));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(ApiResponse.of(null, "500", "An unexpected error occurred"));
        }
    }

//        public ResponseEntity<FamilyResponse> getFamilyData(@PathVariable Long idcs) {
//        FamilyResponse response = familyService.getFamilyData(idcs);
//
//        if (response == null) {
//            return ResponseEntity.notFound().build();
//        }
//
//        return ResponseEntity.ok(response);
//    }
}
