package com.example.springboot_practice.domain.feed.domain.repository;

import com.example.springboot_practice.domain.feed.domain.QFeed;
import com.example.springboot_practice.domain.feed.presentation.dto.response.FeedListResponse;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class FeedRepositoryCustomImpl implements FeedRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;
    private final QFeed qFeed = QFeed.feed;

    @Override
    public List<FeedListResponse> findFeedByAccountId(String accountId) {
        return jpaQueryFactory.select(Projections.constructor(FeedListResponse.class, qFeed.title, qFeed.content, qFeed.createdAt, qFeed.heartCounts, qFeed.heartStatus ,qFeed.user.userName))
                .from(qFeed)
                .where(qFeed.user.accountId.eq(accountId))
                .groupBy(qFeed.id)
                .orderBy(qFeed.createdAt.desc())
                .fetch();

    }

    @Override
    public List<FeedListResponse> findAllFeed() {
        return jpaQueryFactory.select(Projections.constructor(FeedListResponse.class, qFeed.title, qFeed.content, qFeed.createdAt, qFeed.heartCounts, qFeed.heartStatus ,qFeed.user.userName))
                .from(qFeed)
                .orderBy(qFeed.createdAt.desc())
                .fetch();
    }


}