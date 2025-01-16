package com.example.ilovespring.domain.auth.application;

import com.example.ilovespring.domain.auth.exception.PasswordMismatchException;
import com.example.ilovespring.domain.auth.presentation.dto.request.LoginRequest;
import com.example.ilovespring.domain.auth.presentation.dto.response.TokenResponse;
import com.example.ilovespring.domain.user.domain.User;
import com.example.ilovespring.domain.user.domain.repository.UserRepository;
import com.example.ilovespring.domain.user.exception.UserNotFoundException;
import com.example.ilovespring.global.security.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Required
public class LoginService {
    private final JwtTokenProvider jwtTokenProvider;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    @Transactional
    public TokenResponse login(LoginRequest request) {

        User user = userRepository.findByAccountId(request.getAccountId())
                .orElseThrow(()-> UserNotFoundException.EXCEPTION);


        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw PasswordMismatchException.EXCEPTION;
        }

        return jwtTokenProvider.receiveToken(request.getAccountId());
    }
}
