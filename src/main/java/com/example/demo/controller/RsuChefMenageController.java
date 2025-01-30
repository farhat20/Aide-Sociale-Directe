package com.example.demo.controller;

import com.example.demo.service.RsuChefMenageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/rsuChefMenage")
public class RsuChefMenageController {

    private final RsuChefMenageService rsuChefMenageService;

    public RsuChefMenageController(RsuChefMenageService rsuChefMenageService) {
        this.rsuChefMenageService = rsuChefMenageService;
    }

    @GetMapping
    public List<Map<String, Object>> getAllRsuChefMenages() {
        return rsuChefMenageService.getAllRsuChefMenages();
    }
}
