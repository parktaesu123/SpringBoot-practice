package com.example.springboot_practice.domain.connection.domain;

import com.example.springboot_practice.domain.user.domain.User;
import com.example.springboot_practice.global.entity.BaseIdEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Connection extends BaseIdEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private User targetUser;

    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime matchedAt;
}
