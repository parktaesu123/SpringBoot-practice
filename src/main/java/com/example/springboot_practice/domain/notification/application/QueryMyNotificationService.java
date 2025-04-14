package com.example.springboot_practice.domain.notification.application;

import com.example.springboot_practice.domain.notification.domain.repository.NotificationRepository;
import com.example.springboot_practice.domain.notification.presentation.dto.response.NotificationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryMyNotificationService {
    private final NotificationRepository notificationRepository;

    public List<NotificationResponse> queryNotification() {
        return notificationRepository.findById();
    }
}
