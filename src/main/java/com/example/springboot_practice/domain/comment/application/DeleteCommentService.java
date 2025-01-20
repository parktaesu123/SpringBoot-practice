package com.example.springboot_practice.domain.comment.application;

import com.example.springboot_practice.domain.comment.domain.Comment;
import com.example.springboot_practice.domain.comment.domain.repository.CommentRepository;
import com.example.springboot_practice.domain.comment.exception.CannotModifyCommentException;
import com.example.springboot_practice.domain.comment.exception.CommentNotFoundException;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DeleteCommentService {
    private final UserFacade userFacade;
    private final CommentRepository commentRepository;

    @Transactional
    public void deleteComment(Long id) {
        User user = userFacade.currentUser();

        Comment comment = commentRepository.findById(id)
                .orElseThrow(() -> CommentNotFoundException.EXCEPTION);

        if (!user.equals(comment.getUser())) {
            throw CannotModifyCommentException.EXCEPTION;
        }

        commentRepository.deleteById(id);
    }
}
