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
public class QueryMyFeedService {
    private final FeedRepository feedRepository;
    private final UserFacade userFacade;

    @Transactional(readOnly = true)
    public List<FeedListResponse> queryMyFeed(String accountId) {
        User user = userFacade.currentUser();

        return feedRepository.findFeedByAccountId(user.getAccountId());
    }
}
