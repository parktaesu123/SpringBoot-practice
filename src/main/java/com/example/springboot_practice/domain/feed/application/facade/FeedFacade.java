package com.example.springboot_practice.domain.feed.application.facade;

import com.example.springboot_practice.domain.feed.domain.Feed;
import com.example.springboot_practice.domain.feed.domain.repository.FeedRepository;
import com.example.springboot_practice.domain.feed.exception.FeedNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FeedFacade {
    private final FeedRepository feedRepository;

    public Feed getFeeds(String title) {
        return feedRepository.findByTitle(title)
                .orElseThrow(() -> FeedNotFoundException.EXCEPTION);
    }
}
