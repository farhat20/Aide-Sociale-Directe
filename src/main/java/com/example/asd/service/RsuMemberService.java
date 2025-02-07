package com.example.asd.service;

import com.example.asd.dto.response.RsuMemberResponse;

import java.util.List;

public interface RsuMemberService {

    RsuMemberResponse rsuMemberResponse(Long idcs);
    List<RsuMemberResponse> getAllRsuMember();
}
