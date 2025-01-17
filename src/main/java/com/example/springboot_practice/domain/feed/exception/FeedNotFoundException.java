package com.example.springboot_practice.domain.feed.exception;

import com.example.springboot_practice.global.error.exception.ClimException;
import com.example.springboot_practice.global.error.exception.ErrorCode;

public class FeedNotFoundException extends ClimException {
    public static final FeedNotFoundException EXCEPTION = new FeedNotFoundException();

    public FeedNotFoundException() {
        super(ErrorCode.FEED_NOT_FOUND);
    }
}
