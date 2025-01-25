package com.example.springboot_practice.domain.connection.presentation.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ConnectionResponse {
    private Integer connectionCounts;
    private boolean connected;
}
