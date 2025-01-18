package com.example.springboot_practice.domain.feed.application;

import com.example.springboot_practice.domain.feed.application.facade.FeedFacade;
import com.example.springboot_practice.domain.feed.domain.Feed;
import com.example.springboot_practice.domain.feed.domain.repository.FeedRepository;
import com.example.springboot_practice.domain.feed.presentation.dto.response.FeedResponse;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class QueryFeedService {
    private final UserFacade userFacade;
    private final FeedFacade feedFacade;
    private final FeedRepository feedRepository;

    @Transactional(readOnly = true)
    public FeedResponse queryFeed(String title) {
        User user = userFacade.currentUser();
        Feed feed = feedFacade.getFeeds(title);

        return FeedResponse.builder()
                .title(feed.getTitle())
                .content(feed.getContent())
                .createdAt(feed.getCreatedAt())
                .userName(user.getUserName())
                .build();
    }
}
