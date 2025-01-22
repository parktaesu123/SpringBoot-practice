package com.example.springboot_practice.domain.feed.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class FeedResponse {
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private Integer heartCounts;
    private boolean heartStatus;
    private String userName;
}
