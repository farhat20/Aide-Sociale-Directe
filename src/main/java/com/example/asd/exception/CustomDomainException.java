package com.example.asd.exception;

import java.util.Map;

public class CustomDomainException extends DomainException {

    public CustomDomainException(String message) {
        super(message);
    }

    public CustomDomainException(String message, Map<String, String> details) {
        super(message, details);
    }

    public CustomDomainException(String message, Map<String, String> details, Object... args) {
        super(message, details, args);
    }

    public CustomDomainException(String message, Object... args) {
        super(message, args);
    }
}
