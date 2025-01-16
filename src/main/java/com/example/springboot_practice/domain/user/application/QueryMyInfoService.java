package com.example.springboot_practice.domain.user.application;

import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import com.example.springboot_practice.domain.user.presentation.dto.response.MyInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QueryMyInfoService {

    private final UserFacade userFacade;

    public MyInfoResponse QueryMyInfo() {
        User user = userFacade.currentUser();

        return MyInfoResponse.builder()
                .userName(user.getUserName())
                .accountId(user.getAccountId())
                .password(user.getPassword())
                .introduction(user.getIntroduction())
                .build();
    }
}
