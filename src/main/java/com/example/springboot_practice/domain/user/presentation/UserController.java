package com.example.springboot_practice.domain.user.presentation;

import com.example.springboot_practice.domain.user.application.MyInfoService;
import com.example.springboot_practice.domain.user.presentation.dto.response.MyInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final MyInfoService myInfoService;

    @GetMapping("/my-info")
    public MyInfoResponse myInfo() {
        return myInfoService.myInfo();
    }
}
