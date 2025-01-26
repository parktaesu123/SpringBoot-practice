package com.example.springboot_practice.domain.user.presentation.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OtherUserInfoResponse {
    private String userName;
    private Integer connectionCounts;
    private boolean connected;
    private String introduction;
}
