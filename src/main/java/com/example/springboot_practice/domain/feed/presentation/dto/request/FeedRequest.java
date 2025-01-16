package com.example.springboot_practice.domain.feed.presentation.dto.request;

import lombok.Getter;

@Getter
public class FeedRequest {
    private String title;
    private String content;
    private String createdAt;
}
