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

    @NotNull(message = "Beneficiary request is required")
    @Valid
    private CheckBeneficiaryFamilyRequest beneficiaryRequest;

    @NotNull(message = "Child request is required")
    @Valid
    private GetInfoChildRequest childRequest;

    @NotNull(message = "Partner request is required")
    @Valid
    private GetInfoPartnerRequest partnerRequest;
}
