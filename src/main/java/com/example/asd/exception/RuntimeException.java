package com.example.asd.exception;

public class RuntimeException extends java.lang.RuntimeException {
    public RuntimeException(String message) {
        super(message);
    }

    public RuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
