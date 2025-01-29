package com.example.springboot_practice.domain.notification.application;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.graphql.GraphQlProperties;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@Service
@RequiredArgsConstructor
public class NotificationService {
    private final SseEmitterService sseEmitterService;

    public SseEmitter subscribe(UserDetails userDetails) {
        Long userId = Long.parseLong(userDetails.getUsername());
        return sseEmitterService.subscribe(userId);
    }

}
