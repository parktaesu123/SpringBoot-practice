package com.example.springboot_practice.domain.comment.domain.presentation;

import com.example.springboot_practice.domain.comment.domain.application.CreateCommentService;
import com.example.springboot_practice.domain.comment.domain.presentation.dto.request.CommentRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CreateCommentService createCommentService;

    @PostMapping("/{title}")
    public void createComment(@PathVariable String title, @RequestBody @Valid CommentRequest request) {
        createCommentService.createComment(title, request);
    }
}
