package com.example.springboot_practice.domain.user.presentation;

import com.example.springboot_practice.domain.user.application.DeleteUserService;
import com.example.springboot_practice.domain.user.application.MyInfoService;
import com.example.springboot_practice.domain.user.presentation.dto.response.MyInfoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final MyInfoService myInfoService;
    private final DeleteUserService deleteUserService;

    @GetMapping("/my-info")
    public MyInfoResponse myInfo() {
        return myInfoService.myInfo();
    }

    @DeleteMapping("/{accountId}")
    public void deleteUser(@PathVariable String accountId) {
        deleteUserService.deleteUser(accountId);
    }
}
