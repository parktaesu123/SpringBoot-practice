package com.example.springboot_practice.domain.notification.presentation;

import com.example.springboot_practice.domain.notification.application.NotificationService;
import com.example.springboot_practice.domain.notification.application.QueryMyNotificationService;
import com.example.springboot_practice.domain.notification.presentation.dto.response.NotificationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.List;

@RestController
@RequestMapping("/notification")
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;
    private final QueryMyNotificationService queryMyNotificationService;

    @GetMapping("/subscribe")
    public SseEmitter subscribe() {
        return notificationService.subscribe();
    }

    @GetMapping("/{accountId}")
    public List<NotificationResponse> query(@PathVariable String accountId) {
        return queryMyNotificationService.queryNotification(accountId);
    }
}
