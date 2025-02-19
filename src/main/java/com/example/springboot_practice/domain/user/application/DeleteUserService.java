package com.example.springboot_practice.domain.user.application;

import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import com.example.springboot_practice.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DeleteUserService {
    private final UserFacade userFacade;
    private final UserRepository userRepository;

    @Transactional
    public void deleteUser(String accountId) {
        User user = userFacade.currentUser();

        userRepository.deleteByAccountId(accountId);
    }
}
