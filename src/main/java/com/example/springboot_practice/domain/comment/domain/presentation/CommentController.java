package com.example.springboot_practice.domain.comment.domain.presentation;

import com.example.springboot_practice.domain.comment.domain.application.CreateCommentService;
import com.example.springboot_practice.domain.comment.domain.application.QueryCommentByUserNameService;
import com.example.springboot_practice.domain.comment.domain.presentation.dto.request.CommentRequest;
import com.example.springboot_practice.domain.comment.domain.presentation.dto.response.CommentListResponse;
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

    @PostMapping("/{title}")
    public void createComment(@PathVariable String title, @RequestBody @Valid CommentRequest request) {
        createCommentService.createComment(title, request);
    }

    @GetMapping("/{title}/{userName}")
    public List<CommentListResponse> queryCommentByUserName(@PathVariable String title, @PathVariable String userName) {
        return queryCommentService.queryCommentByUserName(title, userName);
    }
}
