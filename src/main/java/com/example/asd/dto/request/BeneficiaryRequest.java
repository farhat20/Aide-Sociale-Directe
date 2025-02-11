package com.example.asd.dto.request;

import com.example.asd.validation.ValidIdcsBeneficiaryFamily;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BeneficiaryRequest {

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
