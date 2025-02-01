package com.example.demo.service.implementation;

import com.example.demo.model.entity.RsuChefMenage;
import com.example.demo.repository.RsuChefMenageRepository;
import com.example.demo.service.RsuChefMenageService;
import com.example.demo.dto.response.RsuChefMenageResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Slf4j
//@RequiredArgsConstructor
public class RsuChefMenageServiceImpl implements RsuChefMenageService {

    private final RsuChefMenageRepository rsuChefMenageRepository;
    @Autowired
    public RsuChefMenageServiceImpl(RsuChefMenageRepository rsuChefMenageRepository) {
        this.rsuChefMenageRepository = rsuChefMenageRepository;
    }

    @Override
    public RsuChefMenageResponse rsuChefMenageResponse(Long idcs) {

        RsuChefMenage result = rsuChefMenageRepository.findByIdcs(idcs)
                .orElseThrow(() -> new RuntimeException("Chef Menage not found with idcs: " + idcs));

        return RsuChefMenageResponse.of(result);
    }

    @Override
    public List<RsuChefMenageResponse> getAllRsuChefMenage() {
        return rsuChefMenageRepository.findAll().stream()
                .map(RsuChefMenageResponse::of)
                .collect(Collectors.toList());
    }

}
