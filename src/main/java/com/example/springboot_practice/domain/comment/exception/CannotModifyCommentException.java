package com.example.springboot_practice.domain.comment.exception;

import com.example.springboot_practice.global.error.exception.ClimException;
import com.example.springboot_practice.global.error.exception.ErrorCode;

public class CannotModifyCommentException extends ClimException {
    public static final CannotModifyCommentException EXCEPTION = new CannotModifyCommentException();

    public CannotModifyCommentException() {
        super(ErrorCode.CANNOT_MODIFY_COMMENT);
    }
}
