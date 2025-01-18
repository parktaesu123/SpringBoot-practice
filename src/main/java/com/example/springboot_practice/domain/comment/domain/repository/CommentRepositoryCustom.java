package com.example.springboot_practice.domain.comment.domain.repository;

import com.example.springboot_practice.domain.comment.domain.presentation.dto.response.CommentListResponse;

import java.util.List;

public interface CommentRepositoryCustom {
    List<CommentListResponse> findCommentByUserName(String userName);
}
