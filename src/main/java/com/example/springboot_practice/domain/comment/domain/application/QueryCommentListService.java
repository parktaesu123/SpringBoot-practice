package com.example.springboot_practice.domain.comment.domain.application;

import com.example.springboot_practice.domain.comment.domain.presentation.dto.response.CommentDetailResponse;
import com.example.springboot_practice.domain.comment.domain.repository.CommentRepository;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryCommentListService {
    private final UserFacade userFacade;
    private final CommentRepository commentRepository;

    @Transactional(readOnly = true)
    public List<CommentDetailResponse> queryAllComment(String title) {
        User user = userFacade.currentUser();

        return commentRepository.findCommentByTitle(title);
    }
}
