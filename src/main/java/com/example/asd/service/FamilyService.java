package com.example.asd.service;

import com.example.asd.dto.response.FamilyResponse;
import java.util.Optional;

public interface FamilyService {
    FamilyResponse getFamilyData(Long idcs);
}
