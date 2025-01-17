package com.example.springboot_practice.domain.feed.application;

import com.example.springboot_practice.domain.feed.domain.repository.FeedRepository;
import com.example.springboot_practice.domain.feed.presentation.dto.response.FeedListResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryAllFeedService {
    private final FeedRepository feedRepository;

    @Transactional(readOnly = true)
    public List<FeedListResponse> queryAllFeed() {
        return feedRepository.findAllFeed();
    }
}
