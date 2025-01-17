package com.example.springboot_practice.domain.feed.presentation;

import com.example.springboot_practice.domain.feed.application.CreateFeedService;
import com.example.springboot_practice.domain.feed.application.QueryMyFeedService;
import com.example.springboot_practice.domain.feed.presentation.dto.request.FeedRequest;
import com.example.springboot_practice.domain.feed.presentation.dto.response.FeedListResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feed")
@RequiredArgsConstructor
public class FeedController {
    private final CreateFeedService createFeedService;
    private final QueryMyFeedService queryMyFeedService;


    @PostMapping("")
    public void createFeed(@RequestBody @Valid FeedRequest request) {
        createFeedService.createFeed(request);
    }

    @GetMapping("")
    public List<FeedListResponse> queryMyFeed() {
        return queryMyFeedService.queryMyFeed();
    }
}
