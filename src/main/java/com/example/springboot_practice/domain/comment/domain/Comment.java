package com.example.springboot_practice.domain.comment.domain;

import com.example.springboot_practice.domain.feed.domain.Feed;
import com.example.springboot_practice.domain.user.domain.User;
import com.example.springboot_practice.global.entity.BaseIdEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Comment extends BaseIdEntity {

    @Column(nullable = false)
    private String content;

    private String createdAt;

    private String updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "feed_id", nullable = false)
    private Feed feed;

    public void update(String content, String createdAt) {
        this.content = content;
        this.createdAt = createdAt;
    }

}
