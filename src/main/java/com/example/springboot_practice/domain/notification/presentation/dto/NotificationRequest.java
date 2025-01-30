package com.example.springboot_practice.domain.notification.presentation.dto;

import com.example.springboot_practice.domain.notification.domain.enums.NotificationType;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.Getter;

@Getter
public class NotificationRequest {
    private User receiveUser;
    private String message;
    private NotificationType type;
    private boolean isRead;
}
