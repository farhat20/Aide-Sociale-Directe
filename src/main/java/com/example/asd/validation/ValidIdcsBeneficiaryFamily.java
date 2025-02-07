package com.example.asd.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = IdcsBeneficiaryFamilyValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidIdcsBeneficiaryFamily {

    String message() default "IDCS not found in database";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
