package com.example.springboot_practice.domain.heart.presentation;

import com.example.springboot_practice.domain.heart.application.HeartService;
import com.example.springboot_practice.domain.heart.presentation.dto.response.HeartResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heart")
@RequiredArgsConstructor
public class HeartController {
    private final HeartService heartService;

    @PostMapping("/{title}")
    public HeartResponse heart(@PathVariable String title) {
        return heartService.heartService(title);
    }
}
