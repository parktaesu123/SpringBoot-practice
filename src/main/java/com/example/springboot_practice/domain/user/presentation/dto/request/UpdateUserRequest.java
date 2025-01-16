package com.example.springboot_practice.domain.user.presentation.dto.request;

import lombok.Getter;

@Getter
public class UpdateUserRequest {
    private String userName;

    private String introduction;
}
