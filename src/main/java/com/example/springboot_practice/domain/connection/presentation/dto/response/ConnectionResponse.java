package com.example.springboot_practice.domain.connection.presentation.dto.response;

import lombok.Getter;

@Getter
public class ConnectionResponse {
    private Integer connectionCounts;
    private boolean connected;
}
