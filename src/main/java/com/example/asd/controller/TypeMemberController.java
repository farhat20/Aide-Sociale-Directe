package com.example.asd.controller;

import com.example.asd.dto.response.TypeMemberResponse;
import com.example.asd.service.TypeMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/typeMember")
public class TypeMemberController {

    private final TypeMemberService typeMemberService;
    @Autowired
    public TypeMemberController(TypeMemberService typeMemberService) {
        this.typeMemberService = typeMemberService;
    }

    @GetMapping
    public ResponseEntity<List<TypeMemberResponse>> getAllTypeMember() {
        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(typeMemberService.getAllTypeMember());
    }
}
