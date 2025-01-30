package com.example.springboot_practice.domain.notification.application;

import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@Service
@RequiredArgsConstructor
public class NotificationService {
    private final SseEmitterService sseEmitterService;
    private final UserFacade userFacade;

    public SseEmitter subscribe() {
        User user = userFacade.currentUser();
        return sseEmitterService.subscribe(user.getAccountId());
    }

}
