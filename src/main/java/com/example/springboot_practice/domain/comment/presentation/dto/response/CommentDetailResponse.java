package com.example.springboot_practice.domain.comment.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class CommentDetailResponse {
    private String content;
    private String userName;
    private String title;
    private LocalDateTime createdAt;
}
