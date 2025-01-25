package com.example.springboot_practice.domain.connection.application;

import com.example.springboot_practice.domain.connection.application.facade.ConnectionFacade;
import com.example.springboot_practice.domain.connection.domain.Connection;
import com.example.springboot_practice.domain.connection.domain.repository.ConnectionRepository;
import com.example.springboot_practice.domain.connection.exception.ConnectedAlreadyException;
import com.example.springboot_practice.domain.connection.presentation.dto.request.ConnectionRequest;
import com.example.springboot_practice.domain.connection.presentation.dto.response.ConnectionResponse;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ConnectionService {
    private final ConnectionRepository connectionRepository;
    private final UserFacade userFacade;
    private final ConnectionFacade connectionFacade;

    @Transactional
    public ConnectionResponse connect(ConnectionRequest request) {
        User user = userFacade.currentUser();
        User targetUser = userFacade.findTargetUser(request.getTargetUserAccountId());

        if (connectionFacade.checkConnection(user, targetUser)) {
            throw ConnectedAlreadyException.EXCEPTION;
        }

        connectionRepository.save(Connection.builder()
                        .user(user)
                        .targetUser(targetUser)
                .build());

        user.addConnectionCounts();
        targetUser.addConnectionCounts();

        return ConnectionResponse.builder()
                .connectionCounts(user.getConnectionCounts())
                .connected(connectionFacade.checkConnection(user, targetUser))
                .build();
    }
}
