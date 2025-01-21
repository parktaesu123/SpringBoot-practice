package com.example.springboot_practice.domain.feed.application;

import com.example.springboot_practice.domain.feed.domain.Feed;
import com.example.springboot_practice.domain.feed.domain.repository.FeedRepository;
import com.example.springboot_practice.domain.feed.presentation.dto.request.FeedRequest;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CreateFeedService {
    private final UserFacade userFacade;
    private final FeedRepository feedRepository;

    @Transactional
    public void createFeed(FeedRequest request) {
        User user = userFacade.currentUser();

        feedRepository.save(Feed.builder()
                        .title(request.getTitle())
                        .content(request.getContent())
                        .user(user)
                .build());
    }
}
