package com.example.springboot_practice.domain.notification.application;

import com.example.springboot_practice.domain.notification.domain.repository.NotificationRepository;
import com.example.springboot_practice.domain.notification.presentation.dto.response.NotificationResponse;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import com.example.springboot_practice.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryMyNotificationService {
    private final UserRepository userRepository;
    private final UserFacade userFacade;

    @Transactional(readOnly = true)
    public List<NotificationResponse> queryNotification(String accountId) {
        User user = userFacade.currentUser();

        return userRepository.findNotificationByAccountId(user.getAccountId());
    }
}
