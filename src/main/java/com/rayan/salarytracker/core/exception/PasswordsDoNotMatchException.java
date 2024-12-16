package com.rayan.salarytracker.core.exception;

public class PasswordsDoNotMatchException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public PasswordsDoNotMatchException(String message) {
        super(message);
    }
}