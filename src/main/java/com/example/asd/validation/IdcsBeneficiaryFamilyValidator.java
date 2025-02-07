package com.example.asd.validation;

import com.example.asd.repository.RsuChefMenageRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class IdcsBeneficiaryFamilyValidator implements ConstraintValidator<ValidIdcsBeneficiaryFamily, Long> {

    @Autowired
    private RsuChefMenageRepository rsuChefMenageRepository;

    @Override
    public boolean isValid(Long idcs, ConstraintValidatorContext context) {
        if (idcs == null) {
            return false; // IDCS cannot be null
        }
        return rsuChefMenageRepository.existsById(idcs); // Check if IDCS exists in DB
    }
}
