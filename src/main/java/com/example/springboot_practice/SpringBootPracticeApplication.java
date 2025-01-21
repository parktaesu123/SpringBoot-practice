package com.example.springboot_practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing // Auditing 활성화
public class SpringBootPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootPracticeApplication.class, args);
    }
}
