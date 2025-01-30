package com.example.springboot_practice.domain.notification.application.facade;

import com.example.springboot_practice.domain.notification.domain.repository.NotificationRepository;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationFacade {
    private final NotificationRepository notificationRepository;

    public boolean checkRead(User receiveUser) {
        return notificationRepository.existsByReceiveUser(receiveUser);
    }
}
