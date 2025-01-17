package com.example.springboot_practice.domain.feed.application;

import com.example.springboot_practice.domain.feed.application.facade.FeedFacade;
import com.example.springboot_practice.domain.feed.domain.Feed;
import com.example.springboot_practice.domain.feed.presentation.dto.request.FeedRequest;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateFeedService {
    private final UserFacade userFacade;
    private final FeedFacade feedFacade;

    @Transactional
    public void updateFeed(String title, FeedRequest request) {
        User user = userFacade.currentUser();
        Feed feed = feedFacade.getFeeds(title);

        feed.update(request.getTitle(), request.getContent(), request.getCreatedAt());
    }
}
