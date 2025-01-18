package com.example.springboot_practice.domain.feed.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class FeedResponse {
    private String title;
    private String content;
    private String createdAt;
    private String userName;

}
