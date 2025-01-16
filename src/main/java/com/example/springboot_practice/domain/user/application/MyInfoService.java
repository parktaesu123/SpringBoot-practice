package com.example.ilovespring.domain.user.application;

import com.example.ilovespring.domain.user.application.facade.UserFacade;
import com.example.ilovespring.domain.user.domain.User;
import com.example.ilovespring.domain.user.presentation.dto.response.MyInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyInfoService {

    private final UserFacade userFacade;

    public MyInfoResponse myInfo() {
        User user = userFacade.currentUser();

        return MyInfoResponse.builder()
                .userName(user.getUserName())
                .accountId(user.getAccountId())
                .password(user.getPassword())
                .introduction(user.getIntroduction())
                .build();
    }
}
