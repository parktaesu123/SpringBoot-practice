package com.example.ilovespring.domain.auth.application;

import com.example.ilovespring.domain.auth.presentation.dto.request.SignupRequest;
import com.example.ilovespring.domain.user.domain.User;
import com.example.ilovespring.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SignupService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public void signup(SignupRequest request) {
        userRepository.save(User.builder()
                .userName(request.getUserName())
                .accountId(request.getAccountId())
                .password(passwordEncoder.encode(request.getPassword()))
                .introduction(request.getIntroduction())
                .role(request.getRole())
                .build());
    }
}
