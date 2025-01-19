package com.example.springboot_practice.domain.feed.exception;

import com.example.springboot_practice.global.error.exception.ClimException;
import com.example.springboot_practice.global.error.exception.ErrorCode;

public class CannotModifyFeedException extends ClimException {
    public static final CannotModifyFeedException EXCEPTION = new CannotModifyFeedException();

    public CannotModifyFeedException() {
        super(ErrorCode.CANNOT_MODIFY_FEED);
    }
}
