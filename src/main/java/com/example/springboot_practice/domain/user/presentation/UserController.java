package com.example.springboot_practice.domain.user.presentation;

import com.example.springboot_practice.domain.user.application.DeleteUserService;
import com.example.springboot_practice.domain.user.application.QueryMyInfoService;
import com.example.springboot_practice.domain.user.application.QueryOtherUserInfoService;
import com.example.springboot_practice.domain.user.application.UpdateUserService;
import com.example.springboot_practice.domain.user.presentation.dto.request.UpdateUserRequest;
import com.example.springboot_practice.domain.user.presentation.dto.response.MyInfoResponse;
import com.example.springboot_practice.domain.user.presentation.dto.response.OtherUserInfoResponse;
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
    private final QueryOtherUserInfoService queryOtherUserInfoService;

    @GetMapping("/my-info")
    public MyInfoResponse myInfo() {
        return querymyInfoService.QueryMyInfo();
    }

    @GetMapping("/{accountId}")
    public OtherUserInfoResponse OtherUserInfo(@PathVariable String accountId) {
        return queryOtherUserInfoService.queryOtherUserInfo(accountId);
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
