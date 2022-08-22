package com.logic.springsecurity.exceptions;

public class SpringSecurityException extends RuntimeException {
    public SpringSecurityException(String exMessage, Exception exception) {
        super(exMessage, exception);
    }

    public SpringSecurityException(String exMessage) {
        super(exMessage);
    }
}
