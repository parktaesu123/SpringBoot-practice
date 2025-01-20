package com.example.springboot_practice.domain.comment.presentation;

import com.example.springboot_practice.domain.comment.application.*;
import com.example.springboot_practice.domain.comment.presentation.dto.request.CommentRequest;
import com.example.springboot_practice.domain.comment.presentation.dto.response.CommentDetailResponse;
import com.example.springboot_practice.domain.comment.presentation.dto.response.CommentListResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CreateCommentService createCommentService;
    private final QueryCommentByUserNameService queryCommentService;
    private final QueryCommentListService queryCommentListService;
    private final UpdateCommentService updateCommentService;
    private final DeleteCommentService deleteCommentService;

    @PostMapping("/{title}")
    public void createComment(@PathVariable String title, @RequestBody @Valid CommentRequest request) {
        createCommentService.createComment(title, request);
    }

    @GetMapping("/{title}/{userName}")
    public List<CommentListResponse> queryCommentByUserName(@PathVariable String title, @PathVariable String userName) {
        return queryCommentService.queryCommentByUserName(title, userName);
    }

    @GetMapping("/{title}")
    public List<CommentDetailResponse> queryCommentByTitle(@PathVariable String title) {
        return queryCommentListService.queryAllComment(title);
    }

    @PatchMapping("/{id}")
    public void updateComment(@PathVariable Long id) {
        updateCommentService.updateComment(id);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        deleteCommentService.deleteComment(id);
    }

}
