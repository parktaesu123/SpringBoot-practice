package com.example.springboot_practice.domain.connection.presentation;

import com.example.springboot_practice.domain.connection.application.ConnectionService;
import com.example.springboot_practice.domain.connection.presentation.dto.request.ConnectionRequest;
import com.example.springboot_practice.domain.connection.presentation.dto.response.ConnectionResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/connection")
@RequiredArgsConstructor
public class ConnectionController {
    private final ConnectionService connectionService;

    @PostMapping("")
    public ConnectionResponse connect(@RequestBody ConnectionRequest request) {
        return connectionService.connect(request);
    }

}
