package com.example.springboot_practice.domain.auth.presentation.dto.request;

import com.example.springboot_practice.domain.user.domain.enums.Role;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class SignupRequest {

    @NotBlank
    private String userName;

    @NotBlank
    private String accountId;

    @NotBlank
    private String password;

    private String introduction;

    private Role role;
}
