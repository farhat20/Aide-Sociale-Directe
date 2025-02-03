package com.example.demo.service;

import com.example.demo.dto.response.RsuChefMenageResponse;
import java.util.List;

public interface RsuChefMenageService {

    RsuChefMenageResponse rsuChefMenageResponse(Long idcs);
    List<RsuChefMenageResponse> getAllRsuChefMenage();
}
