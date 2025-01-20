package com.example.springboot_practice.domain.feed.application;

import com.example.springboot_practice.domain.feed.application.facade.FeedFacade;
import com.example.springboot_practice.domain.feed.domain.Feed;
import com.example.springboot_practice.domain.feed.domain.repository.FeedRepository;
import com.example.springboot_practice.domain.feed.exception.CannotModifyFeedException;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DeleteFeedService {
    private final UserFacade userFacade;
    private final FeedFacade feedFacade;
    private final FeedRepository feedRepository;

    @Transactional
    public void deleteFeed(String title) {
        User user = userFacade.currentUser();
        Feed feed = feedFacade.getFeeds(title);

        if (!user.equals(feed.getUser())) {
            throw CannotModifyFeedException.EXCEPTION;
        }

        feedRepository.deleteByTitle(title);
    }
}
