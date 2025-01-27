package com.example.springboot_practice.domain.notification.domain;

import com.example.springboot_practice.domain.notification.domain.enums.NotificationType;
import com.example.springboot_practice.domain.user.domain.User;
import com.example.springboot_practice.global.entity.BaseCreateTimeIdEntity;
import com.example.springboot_practice.global.entity.BaseTimeIdEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Notification extends BaseCreateTimeIdEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false)
    private User ReceiveUser;

    private String message;

    private boolean isRead;

    private NotificationType type;
}
