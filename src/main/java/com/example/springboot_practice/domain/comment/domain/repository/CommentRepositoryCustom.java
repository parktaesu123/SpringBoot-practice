package com.example.springboot_practice.domain.comment.domain.repository;

import com.example.springboot_practice.domain.comment.presentation.dto.response.CommentDetailResponse;
import com.example.springboot_practice.domain.comment.presentation.dto.response.CommentListResponse;

import java.util.List;

public interface CommentRepositoryCustom {
    List<CommentListResponse> findCommentByUserName(String userName);

    List<CommentDetailResponse> findCommentByTitle(String title);
}
