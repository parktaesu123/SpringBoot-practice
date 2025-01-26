package com.example.springboot_practice.domain.user.application;

import com.example.springboot_practice.domain.connection.application.facade.ConnectionFacade;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import com.example.springboot_practice.domain.user.domain.repository.UserRepository;
import com.example.springboot_practice.domain.user.presentation.dto.response.OtherUserInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class QueryOtherUserInfoService {
    private final UserFacade userFacade;
    private final ConnectionFacade connectionFacade;

    public OtherUserInfoResponse queryOtherUserInfo(String accountId) {
        User user = userFacade.currentUser();
        User targetUser = userFacade.findTargetUser(accountId);

        return OtherUserInfoResponse.builder()
                .userName(targetUser.getUserName())
                .connectionCounts(targetUser.getConnectionCounts())
                .connected(connectionFacade.checkConnection(user, targetUser))
                .introduction(targetUser.getIntroduction())
                .build();
    }
}
