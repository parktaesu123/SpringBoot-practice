package com.example.ilovespring.domain.auth.application;

import com.example.ilovespring.domain.auth.domain.RefreshToken;
import com.example.ilovespring.domain.auth.domain.repository.RefreshTokenRepository;
import com.example.ilovespring.domain.auth.exception.RefreshTokenNotFoundException;
import com.example.ilovespring.domain.user.application.facade.UserFacade;
import com.example.ilovespring.domain.user.domain.User;
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
                .orElseThrow(()-> RefreshTokenNotFoundException.EXCEPTION);

        refreshTokenRepository.delete(refreshToken);

    }
}
