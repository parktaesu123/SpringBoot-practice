package com.example.springboot_practice.domain.comment.domain.application;

import com.example.springboot_practice.domain.comment.domain.presentation.dto.response.CommentListResponse;
import com.example.springboot_practice.domain.comment.domain.repository.CommentRepository;
import com.example.springboot_practice.domain.feed.application.facade.FeedFacade;
import com.example.springboot_practice.domain.feed.domain.Feed;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryCommentService {
    private final CommentRepository commentRepository;
    private final UserFacade userFacade;
    private final FeedFacade feedFacade;

    @Transactional(readOnly = true)
    public List<CommentListResponse> queryCommentByUserName(String title, String userName) {
        User user = userFacade.currentUser();
        Feed feed = feedFacade.getFeeds(title);

        return commentRepository.findCommentByUserName(userName);
    }
}
