package com.example.ilovespring.domain.user.presentation.dto.response;

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

    private String introduction;
}
