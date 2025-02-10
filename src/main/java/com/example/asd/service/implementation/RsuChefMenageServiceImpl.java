package com.example.asd.service.implementation;

import com.example.asd.exception.DomainException;
import com.example.asd.model.entity.RsuChefMenage;
import com.example.asd.repository.RsuChefMenageRepository;
import com.example.asd.service.RsuChefMenageService;
import com.example.asd.dto.response.RsuChefMenageResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Slf4j
public class RsuChefMenageServiceImpl implements RsuChefMenageService {

    private final RsuChefMenageRepository rsuChefMenageRepository;

    @Autowired
    public RsuChefMenageServiceImpl(RsuChefMenageRepository rsuChefMenageRepository) {
        this.rsuChefMenageRepository = rsuChefMenageRepository;
    }

    @Override
    public RsuChefMenageResponse rsuChefMenageResponse(Long idcs) {
        RsuChefMenage result = rsuChefMenageRepository.findByIdcs(idcs)
                .orElseThrow(() -> new DomainException("Chef Menage not found with idcs: " + idcs));

        return RsuChefMenageResponse.of(result);
    }

    @Override
    public List<RsuChefMenageResponse> getAllRsuChefMenage() {
        return rsuChefMenageRepository.findAll().stream()
                .map(RsuChefMenageResponse::of)
                .collect(Collectors.toList());
    }
}

