package com.example.asd.exception;

import java.util.Locale;
import java.util.Map;
import java.util.Objects;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;

@Getter
@Setter
public class DomainException extends RuntimeException {
    private static final Logger log = LoggerFactory.getLogger(DomainException.class);
    protected String status = "500";
    protected String code;
    protected Map<String, String> details;
    protected Object[] args;
    protected String domain;

    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, Map<String, String> details) {
        super(message);
        this.details = details;
    }

    public DomainException(String message, Map<String, String> details, Object... args) {
        super(String.format(message, args));
        this.details = details;
    }

    public DomainException(String message, Object... args) {
        super(String.format(message, args));
    }

    public String getLocalizedMessage(MessageSource messageSource, Locale locale) {
        return Objects.nonNull(this.getMessage())
                ? messageSource.getMessage(this.code, this.args, this.getMessage(), locale)
                : null;
    }

    public DomainException detail(Map<String, String> details) {
        this.details = details;
        return this;
    }

    public DomainException domain(String domain) {
        this.domain = domain;
        return this;
    }

}
