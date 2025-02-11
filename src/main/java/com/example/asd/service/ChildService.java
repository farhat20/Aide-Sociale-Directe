package com.example.asd.service;

import com.example.asd.dto.response.ChildResponse;
import java.util.List;
public interface ChildService {
    ChildResponse getChildByIdcs(Long id);
    List<ChildResponse> getAllChildren();
}

