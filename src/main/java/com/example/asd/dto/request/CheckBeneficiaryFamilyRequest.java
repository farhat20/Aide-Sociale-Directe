package com.example.asd.dto.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CheckBeneficiaryFamilyRequest {

    @NotNull(message = "IDCS is required")
    private Long idcs;

    @NotNull(message = "Identity number is required")
    @Pattern(regexp = "[A-Z0-9]+", message = "Invalid identity number format")
    private String identityNumber;

    @NotNull(message = "Gender is required")
    @Pattern(regexp = "[MF]", message = "Gender must be 'M' or 'F'")
    private String gender;

    @NotNull(message = "Household code is required")
    private String houseHoldCode;
}
