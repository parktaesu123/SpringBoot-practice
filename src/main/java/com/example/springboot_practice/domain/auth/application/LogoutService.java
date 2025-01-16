package com.example.springboot_practice.domain.auth.application;

import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import com.example.springboot_practice.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogoutService {
    private final UserRepository userRepository;
    private final UserFacade userFacade;

    public void logout() {
        User user = userFacade.currentUser();


    }
}
