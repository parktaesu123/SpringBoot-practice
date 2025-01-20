package com.example.springboot_practice.domain.comment.domain.repository;

import com.example.springboot_practice.domain.comment.domain.QComment;
import com.example.springboot_practice.domain.comment.presentation.dto.response.CommentDetailResponse;
import com.example.springboot_practice.domain.comment.presentation.dto.response.CommentListResponse;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class CommentRepositoryCustomImpl implements CommentRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;
    private final QComment qComment = QComment.comment;

    @Override
    public List<CommentListResponse> findCommentByUserName(String userName) {
        return jpaQueryFactory.select(Projections.constructor(CommentListResponse.class, qComment.content, qComment.createdAt, qComment.user.userName, qComment.feed.title))
                .from(qComment)
                .where(qComment.user.userName.eq(userName))
                .groupBy(qComment.id)
                .orderBy(qComment.createdAt.desc())
                .fetch();
    }

    @Override
    public List<CommentDetailResponse> findCommentByTitle(String title) {
        return jpaQueryFactory.select(Projections.constructor(CommentDetailResponse.class, qComment.content, qComment.createdAt, qComment.user.userName, qComment.feed.title))
                .from(qComment)
                .where(qComment.feed.title.eq(title))
                .groupBy(qComment.id)
                .orderBy(qComment.createdAt.desc())
                .fetch();
    }
}
