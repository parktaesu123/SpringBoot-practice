package com.example.springboot_practice.domain.notification.domain.repository;

import com.example.springboot_practice.domain.notification.domain.Notification;
import com.example.springboot_practice.domain.notification.presentation.dto.response.NotificationResponse;
import com.example.springboot_practice.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    boolean existsByReceiveUser(User receiveUser);

}
