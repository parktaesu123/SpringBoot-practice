package com.example.springboot_practice.domain.feed.domain.repository;

import com.example.springboot_practice.domain.feed.presentation.dto.response.FeedListResponse;
import com.example.springboot_practice.domain.feed.presentation.dto.response.FeedResponse;

import java.util.List;

public interface FeedRepositoryCustom {
    List<FeedListResponse> findFeedByAccountId(String accountId);

    List<FeedListResponse> findAllFeed();

    List<FeedListResponse> findFeedByHeart();

    FeedResponse findFeedByTitle(String title);
}