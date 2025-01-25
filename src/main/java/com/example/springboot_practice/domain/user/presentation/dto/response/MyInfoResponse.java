package com.example.springboot_practice.domain.user.presentation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class MyInfoResponse {

    private String userName;

    private String password;

    private String accountId;

    private Integer connectionCounts;

    private String introduction;
}
