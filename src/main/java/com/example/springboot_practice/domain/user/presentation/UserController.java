package com.example.springboot_practice.domain.user.presentation;

import com.example.springboot_practice.domain.user.application.DeleteUserService;
import com.example.springboot_practice.domain.user.application.QueryMyInfoService;
import com.example.springboot_practice.domain.user.application.UpdateUserService;
import com.example.springboot_practice.domain.user.presentation.dto.request.UpdateUserRequest;
import com.example.springboot_practice.domain.user.presentation.dto.response.MyInfoResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final QueryMyInfoService querymyInfoService;
    private final DeleteUserService deleteUserService;
    private final UpdateUserService updateUserService;

    @GetMapping("/my-info")
    public MyInfoResponse myInfo() {
        return querymyInfoService.QueryMyInfo();
    }

    @DeleteMapping("/{accountId}")
    public void deleteUser(@PathVariable String accountId) {
        deleteUserService.deleteUser(accountId);
    }

    @PatchMapping("/{accountId}")
    public void updateUser(@PathVariable String accountId, @RequestBody @Valid UpdateUserRequest request) {
        updateUserService.updateUser(request, accountId);
    }
}
