package com.example.demo.dto.response;

import lombok.Getter;
import lombok.Setter;

public class TypeAidResponse {
    private Long id;
    private String label_fr;
    private String label_ar;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return label_fr; }
    public void setName(String name) { this.label_fr = name; }

    public String getDescription() { return label_ar; }
    public void setDescription(String description) { this.label_ar = description; }
}
