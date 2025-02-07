package com.example.asd.service.implementation;

import com.example.asd.dto.response.RsuChefMenageResponse;
import com.example.asd.dto.response.RsuMemberResponse;
import com.example.asd.exception.DomainException;
import com.example.asd.model.entity.RsuMember;
import com.example.asd.repository.RsuMemberRepository;
import com.example.asd.service.RsuMemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class RsuMemberServiceImlp implements RsuMemberService {

    private final RsuMemberRepository rsuMemberRepository;

    @Autowired
    public RsuMemberServiceImlp(RsuMemberRepository rsuMemberRepository) {
        this.rsuMemberRepository = rsuMemberRepository;
    }

    @Override
    public RsuMemberResponse rsuMemberResponse(Long idcs) {
        RsuMember result = rsuMemberRepository.findByIdcs(idcs)
                .orElseThrow(() -> new DomainException("Member not found with idcs: " + idcs));

        return RsuMemberResponse.of(result);
    }

    @Override
    public List<RsuMemberResponse> getAllRsuMember() {
        return rsuMemberRepository.findAll().stream()
                .map(RsuMemberResponse::of)
                .collect(Collectors.toList());
    }
}
