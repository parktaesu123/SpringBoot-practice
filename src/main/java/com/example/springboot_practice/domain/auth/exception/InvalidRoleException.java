package com.example.springboot_practice.domain.auth.exception;

import com.example.springboot_practice.global.error.exception.ClimException;
import com.example.springboot_practice.global.error.exception.ErrorCode;

public class InvalidRoleException extends ClimException {
    public static final ClimException EXCEPTION = new InvalidRoleException();

    public InvalidRoleException() {
        super(ErrorCode.INVALID_ROLE);
    }
}
