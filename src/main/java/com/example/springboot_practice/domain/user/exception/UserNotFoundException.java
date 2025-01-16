package com.example.ilovespring.domain.user.exception;

import com.example.ilovespring.global.error.exception.ClimException;
import com.example.ilovespring.global.error.exception.ErrorCode;

public class UserNotFoundException extends ClimException {
    public static final ClimException EXCEPTION = new UserNotFoundException();

    public UserNotFoundException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
