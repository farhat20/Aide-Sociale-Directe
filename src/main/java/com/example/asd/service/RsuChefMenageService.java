package com.example.asd.service;

import com.example.asd.dto.response.RsuChefMenageResponse;
import java.util.List;

public interface RsuChefMenageService {

    RsuChefMenageResponse rsuChefMenageResponse(Long idcs);
    List<RsuChefMenageResponse> getAllRsuChefMenage();
}
