package com.example.ilovespring.domain.auth.exception;

import com.example.ilovespring.global.error.exception.ClimException;
import com.example.ilovespring.global.error.exception.ErrorCode;

public class InvalidRoleException extends ClimException {
    public static final ClimException EXCEPTION = new InvalidRoleException();

    public InvalidRoleException() {
        super(ErrorCode.INVALID_ROLE);
    }
}
