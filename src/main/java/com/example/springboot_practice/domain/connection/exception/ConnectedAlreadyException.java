package com.example.springboot_practice.domain.connection.exception;

import com.example.springboot_practice.global.error.exception.ClimException;
import com.example.springboot_practice.global.error.exception.ErrorCode;

public class ConnectedAlreadyException extends ClimException {
    public static final ClimException EXCEPTION = new ConnectedAlreadyException();

    public ConnectedAlreadyException() {
        super(ErrorCode.CONNECTED_ALREADY);
    }
}
