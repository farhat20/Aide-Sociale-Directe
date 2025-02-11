package com.example.asd.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FamilyResponse {

    private RsuMemberResponse partner; // S'il s'agit d'un RSU_MEMBER
    private ChildResponse child; // S'il s'agit d'un Child
}

