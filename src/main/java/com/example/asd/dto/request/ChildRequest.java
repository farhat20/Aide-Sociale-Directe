package com.example.asd.dto.request;

import com.example.asd.validation.ValidIdcs;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChildRequest {

    @NotNull
    private Long idcs;
    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;
    @NotNull
    private String gender;

    @NotNull
    private Long establishmentTypeId;
    private String establishmentCode;
    private boolean withDisability;
    private String parentalRelationship;
    private Boolean orphan;

    private String partnerId;
    private String partnerIdType;
}