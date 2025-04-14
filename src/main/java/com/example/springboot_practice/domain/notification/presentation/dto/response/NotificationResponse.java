package com.example.springboot_practice.domain.notification.presentation.dto.response;

import lombok.Getter;

@Getter
public class NotificationResponse {
    private String message;
    private boolean isRead;
}
