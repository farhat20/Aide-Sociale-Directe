package com.example.asd.validation;

import com.example.asd.exception.AidDataEnrolmentException;
import com.example.asd.repository.RsuMemberRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

public class IdcsValidator implements ConstraintValidator<ValidIdcs, Long> {

    @Autowired
    private RsuMemberRepository rsuMemberRepository;

    @Override
    public boolean isValid(Long idcs, ConstraintValidatorContext context) {
        if (idcs == null || idcs <= 0) {
            throw new AidDataEnrolmentException("IDCS required");
        }
        return true;
    }
}
