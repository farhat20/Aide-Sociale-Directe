package com.example.asd.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetInfoChildRequest {

    @NotNull(message = "Child IDCS is required")
    @Pattern(regexp = "\\d{10}", message = "IDCS must be exactly 10 digits")
    private String childIdcs;
}
