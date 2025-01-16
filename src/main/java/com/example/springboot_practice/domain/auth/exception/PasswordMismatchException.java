package com.example.ilovespring.domain.auth.exception;

import com.example.ilovespring.global.error.exception.ClimException;
import com.example.ilovespring.global.error.exception.ErrorCode;

public class PasswordMismatchException extends ClimException {
    public static final ClimException EXCEPTION = new PasswordMismatchException();

    public PasswordMismatchException() {
        super(ErrorCode.PASSWORD_MISMATCH);
    }
}
