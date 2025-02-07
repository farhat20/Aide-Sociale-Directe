package com.example.asd.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckFamilyRsuEligibilityRequest {

    @NotNull(message = "Beneficiary information is required")
    @Valid
    private CheckBeneficiaryFamilyRequest beneficiary;

    @Valid
    private GetInfoPartnerRequest partner;

    @Valid
    private GetInfoChildRequest child;
}
