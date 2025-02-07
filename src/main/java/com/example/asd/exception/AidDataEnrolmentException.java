package com.example.asd.exception;

import java.util.Map;

public class AidDataEnrolmentException extends DomainException {

    public AidDataEnrolmentException(String message) {
        super(message);
    }

    public AidDataEnrolmentException(String message, Map<String, String> details) {
        super(message, details);
    }

    public AidDataEnrolmentException(String message, Map<String, String> details, Object... args) {
        super(message, details, args);
    }

    public AidDataEnrolmentException(String message, Object... args) {
        super(message, args);
    }
}
