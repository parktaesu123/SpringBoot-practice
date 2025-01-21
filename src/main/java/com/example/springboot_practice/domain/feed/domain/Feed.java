package com.example.springboot_practice.domain.feed.domain;

import com.example.springboot_practice.domain.user.domain.User;
import com.example.springboot_practice.global.entity.BaseTimeIdEntity;
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
public class Feed extends BaseTimeIdEntity {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
