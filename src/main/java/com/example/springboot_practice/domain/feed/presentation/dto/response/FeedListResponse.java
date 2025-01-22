package com.example.springboot_practice.domain.feed.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class FeedListResponse {
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private Integer heartCounts;
    private boolean heartStatus;
    private String userName;
}
