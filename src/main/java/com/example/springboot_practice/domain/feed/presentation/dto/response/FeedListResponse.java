package com.example.springboot_practice.domain.feed.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FeedListResponse {
    private String title;
    private String content;
    private String createdAt;
}
