package com.example.asd.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FamilyRequest {

    private BeneficiaryRequest beneficiary;
    private ChildRequest child;
    private PartnerRequest partner;
}
