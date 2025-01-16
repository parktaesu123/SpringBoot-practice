package com.example.ilovespring.domain.auth.exception;

import com.example.ilovespring.global.error.exception.ClimException;
import com.example.ilovespring.global.error.exception.ErrorCode;

public class ExpiredTokenException extends ClimException {
    public static final ClimException EXCEPTION = new ExpiredTokenException();

    public ExpiredTokenException() {
        super(ErrorCode.EXPIRED_TOKEN);
    }
}
