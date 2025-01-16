package com.example.ilovespring.domain.auth.exception;

import com.example.ilovespring.global.error.exception.ClimException;
import com.example.ilovespring.global.error.exception.ErrorCode;

public class InvalidTokenException extends ClimException {
    public static final ClimException EXCEPTION = new InvalidTokenException();

    public InvalidTokenException() {
        super(ErrorCode.INVALID_TOKEN);
    }
}
