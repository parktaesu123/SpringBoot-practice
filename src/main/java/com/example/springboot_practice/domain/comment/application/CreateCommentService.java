package com.example.springboot_practice.domain.comment.application;

import com.example.springboot_practice.domain.comment.domain.Comment;
import com.example.springboot_practice.domain.comment.presentation.dto.request.CommentRequest;
import com.example.springboot_practice.domain.comment.domain.repository.CommentRepository;
import com.example.springboot_practice.domain.feed.application.facade.FeedFacade;
import com.example.springboot_practice.domain.feed.domain.Feed;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CreateCommentService {
    private final UserFacade userFacade;
    private final FeedFacade feedFacade;
    private final CommentRepository commentRepository;

    @Transactional
    public void createComment(String title, CommentRequest request) {
        User user = userFacade.currentUser();
        Feed feed = feedFacade.getFeeds(title);

        commentRepository.save(Comment.builder()
                        .content(request.getContent())
                        .createdAt(request.getCreatedAt())
                        .user(user)
                        .feed(feed)
                .build());
    }
}
