package com.example.springboot_practice.domain.feed.application;

import com.example.springboot_practice.domain.feed.domain.repository.FeedRepository;
import com.example.springboot_practice.domain.feed.presentation.dto.response.FeedListResponse;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryFeedByHeartService {
    private final UserFacade userFacade;
    private final FeedRepository feedRepository;

    @Transactional(readOnly = true)
    public List<FeedListResponse> queryFeedByHeart() {
        User user = userFacade.currentUser();

        return feedRepository.findFeedByHeart();
    }
}
