package com.example.springboot_practice.domain.heart.application.facade;

import com.example.springboot_practice.domain.feed.domain.Feed;
import com.example.springboot_practice.domain.heart.domain.repository.HeartRepository;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HeartFacade {
    private final HeartRepository heartRepository;

    public boolean checkHeart(User user, Feed feed) {
        return heartRepository.existsHeartByUserAndFeed(user, feed);
    }
}
