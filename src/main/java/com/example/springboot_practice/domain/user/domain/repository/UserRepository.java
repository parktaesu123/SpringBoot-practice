package com.example.springboot_practice.domain.user.domain.repository;

import com.example.springboot_practice.domain.notification.presentation.dto.response.NotificationResponse;
import com.example.springboot_practice.domain.user.domain.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByAccountId(String accountId);

    void deleteByAccountId(String accountId);

    List<NotificationResponse> findNotificationByAccountId(String accountId);
}
