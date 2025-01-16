package com.example.springboot_practice.domain.user.application;

import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import com.example.springboot_practice.domain.user.presentation.dto.request.UpdateUserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateUserService {
    private final UserFacade userFacade;

    @Transactional
    public void updateUser(UpdateUserRequest request, String accountId) {
        User user = userFacade.currentUser();

        user.updateUser(request.getUserName(), request.getIntroduction());
    }
}
