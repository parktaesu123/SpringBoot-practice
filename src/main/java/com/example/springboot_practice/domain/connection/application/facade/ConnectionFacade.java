package com.example.springboot_practice.domain.connection.application.facade;

import com.example.springboot_practice.domain.connection.domain.repository.ConnectionRepository;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConnectionFacade {
    private final ConnectionRepository connectionRepository;

    public boolean checkConnection(User user, User targetUser) {
        return connectionRepository.existsConnectionByUserAndTargetUser(user, targetUser);
    }
}
