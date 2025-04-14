package com.example.springboot_practice.domain.notification.application;

import com.example.springboot_practice.domain.notification.domain.Notification;
import com.example.springboot_practice.domain.notification.domain.repository.NotificationRepository;
import com.example.springboot_practice.domain.notification.presentation.dto.request.NotificationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
@RequiredArgsConstructor
public class SendNotificationService {
    private final NotificationRepository notificationRepository;
    private final Map<String, SseEmitter> emitters = new ConcurrentHashMap<>();

    public void sendNotification(NotificationRequest request) {
        Notification notification = notificationRepository.save(Notification.builder()
                        .receiveUser(request.getReceiveUser())
                        .isRead(false)
                        .message(request.getMessage())
                        .type(request.getType())
                .build());

        SseEmitter sseEmitter = emitters.get(request.getReceiveUser().getAccountId());

        if (sseEmitter != null) {
            try {
                sseEmitter.send(SseEmitter.event()
                        .id(notification.getId().toString())
                        .name("알림")
                        .data(notification)
                );
            } catch (IOException e) {
                emitters.remove(request.getReceiveUser().getAccountId());
            }
        }


    }
}
