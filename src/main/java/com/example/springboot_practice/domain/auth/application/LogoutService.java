package com.example.springboot_practice.domain.auth.application;

import com.example.springboot_practice.domain.auth.domain.RefreshToken;
import com.example.springboot_practice.domain.auth.domain.repository.RefreshTokenRepository;
import com.example.springboot_practice.domain.auth.exception.RefreshTokenNotFoundException;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogoutService {
    private final RefreshTokenRepository refreshTokenRepository;
    private final UserFacade userFacade;

    public void logout() {
        User user = userFacade.currentUser();

        RefreshToken refreshToken = refreshTokenRepository.findById(user.getAccountId())
                .orElseThrow(() -> RefreshTokenNotFoundException.EXCEPTION);

        refreshTokenRepository.delete(refreshToken);

    }
}
