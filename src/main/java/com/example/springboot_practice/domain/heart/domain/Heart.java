package com.example.springboot_practice.domain.heart.domain;

import com.example.springboot_practice.domain.feed.domain.Feed;
import com.example.springboot_practice.domain.user.domain.User;
import com.example.springboot_practice.global.entity.BaseIdEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Heart extends BaseIdEntity {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private Feed feed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private User user;
}
