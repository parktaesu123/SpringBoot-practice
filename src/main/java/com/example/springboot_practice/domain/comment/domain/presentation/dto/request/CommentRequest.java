package com.example.springboot_practice.domain.comment.domain.presentation.dto.request;

import lombok.Getter;

@Getter
public class CommentRequest {
    private String content;
    private String createdAt;
}
