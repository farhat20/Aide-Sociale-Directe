package com.example.asd.service.implementation;

import com.example.asd.dto.response.ChildResponse;
import com.example.asd.exception.DomainException;
import com.example.asd.model.entity.Child;
import com.example.asd.repository.ChildRepository;
import com.example.asd.service.ChildService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ChildServiceImpl implements ChildService {

    private final ChildRepository childRepository;

    @Autowired
    public ChildServiceImpl(ChildRepository childRepository) {
        this.childRepository = childRepository;
    }

    @Override
    public ChildResponse getChildByIdcs(Long id) {
        Child child = childRepository.findByIdcs(id)
                .orElseThrow(() -> new DomainException("Child not found with id: " + id));

        return ChildResponse.of(child);
    }

    @Override
    public List<ChildResponse> getAllChildren() {
        return childRepository.findAll().stream()
                .map(ChildResponse::of)
                .collect(Collectors.toList());
    }
}
