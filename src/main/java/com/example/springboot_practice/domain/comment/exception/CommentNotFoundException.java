package com.example.springboot_practice.domain.comment.exception;

import com.example.springboot_practice.global.error.exception.ClimException;
import com.example.springboot_practice.global.error.exception.ErrorCode;

public class CommentNotFoundException extends ClimException {
    public static final CommentNotFoundException EXCEPTION = new CommentNotFoundException();

    public CommentNotFoundException() {
        super(ErrorCode.COMMENT_NOT_FOUND);
    }
}
