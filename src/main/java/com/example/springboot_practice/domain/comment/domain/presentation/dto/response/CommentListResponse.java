package com.example.springboot_practice.domain.comment.domain.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CommentResponse {
    private String content;
    private String createdAt;
    private String userName;
    private String title;
}
