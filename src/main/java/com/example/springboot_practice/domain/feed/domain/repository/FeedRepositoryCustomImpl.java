package com.example.springboot_practice.domain.feed.domain.repository;

import com.example.springboot_practice.domain.feed.domain.QFeed;
import com.example.springboot_practice.domain.feed.presentation.dto.response.FeedListResponse;
import com.example.springboot_practice.domain.feed.presentation.dto.response.FeedResponse;
import com.example.springboot_practice.domain.heart.domain.QHeart;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class FeedRepositoryCustomImpl implements FeedRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;
    private final QFeed qFeed = QFeed.feed;
    private final QHeart qHeart = QHeart.heart;

    @Override
    public List<FeedListResponse> findFeedByAccountId(String accountId) {
        return jpaQueryFactory.select(Projections.constructor(FeedListResponse.class, qFeed.title, qFeed.content, qFeed.createdAt, qFeed.heartCounts, qHeart.isNotNull() ,qFeed.user.userName))
                .from(qFeed)
                .leftJoin(qHeart)
                .on(qHeart.user.accountId.eq(accountId))
                .where(qFeed.user.accountId.eq(accountId))
                .orderBy(qFeed.createdAt.desc())
                .fetch();

    }

    @Override
    public List<FeedListResponse> findAllFeed() {
        return jpaQueryFactory.select(Projections.constructor(FeedListResponse.class, qFeed.title, qFeed.content, qFeed.createdAt, qFeed.heartCounts, qHeart.isNotNull() ,qFeed.user.userName))
                .from(qFeed)
                .leftJoin(qHeart)
                .on(qHeart.feed.eq(qFeed))
                .orderBy(qFeed.createdAt.desc())
                .fetch();
    }

    @Override
    public List<FeedListResponse> findFeedByHeart() {
        return jpaQueryFactory.select(Projections.constructor(FeedListResponse.class, qFeed.title, qFeed.content, qFeed.createdAt, qFeed.heartCounts, qHeart.isNotNull(), qFeed.user.userName))
                .from(qFeed)
                .leftJoin(qHeart)
                .on(qHeart.feed.eq(qFeed))
                .orderBy(qFeed.heartCounts.desc())
                .fetch();
    }

    @Override
    public FeedResponse findFeedByTitle(String title) {
        return jpaQueryFactory.select(Projections.constructor(FeedResponse.class, qFeed.title, qFeed.content, qFeed.createdAt, qFeed.heartCounts, qHeart.isNotNull(), qFeed.user.userName))
                .from(qFeed)
                .leftJoin(qHeart)
                .on(qHeart.feed.eq(qFeed))
                .fetchOne();
    }


}