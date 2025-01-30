package com.example.demo.service.implementation;

import com.example.demo.repository.RsuChefMenageRepository;
import com.example.demo.service.RsuChefMenageService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class RsuChefMenageServiceImpl implements RsuChefMenageService {

    private final RsuChefMenageRepository rsuChefMenageRepository;

    public RsuChefMenageServiceImpl(RsuChefMenageRepository rsuChefMenageRepository) {
        this.rsuChefMenageRepository = rsuChefMenageRepository;
    }

    @Override
    public List<Map<String, Object>> getAllRsuChefMenages() {
        return rsuChefMenageRepository.findAllDynamic();
    }
}
