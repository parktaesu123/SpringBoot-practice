package com.example.springboot_practice.domain.comment.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CommentListResponse {
    private String content;
    private String userName;
    private String title;
    private String createdAt;
}
