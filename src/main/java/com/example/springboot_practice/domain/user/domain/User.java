package com.example.springboot_practice.domain.user.domain;

import com.example.springboot_practice.domain.user.domain.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String userName;

    @Column(nullable = false)
    private String accountId;

    private String introduction;

    @Column(nullable = false)
    private String password;

    private Role role;

    @Builder
    public void updateUser(String userName, String introduction) {
        this.userName = userName;
        this.introduction = introduction;
    }
}
