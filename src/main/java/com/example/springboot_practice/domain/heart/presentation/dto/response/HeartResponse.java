package com.example.springboot_practice.domain.heart.presentation.dto.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class HeartResponse {
    private Integer heart;
    private boolean heartStatus;
}
