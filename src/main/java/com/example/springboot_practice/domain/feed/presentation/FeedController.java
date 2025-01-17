package com.example.springboot_practice.domain.feed.presentation;

import com.example.springboot_practice.domain.feed.application.CreateFeedService;
import com.example.springboot_practice.domain.feed.application.QueryAllFeedService;
import com.example.springboot_practice.domain.feed.application.QueryMyFeedService;
import com.example.springboot_practice.domain.feed.application.UpdateFeedService;
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
    private final QueryAllFeedService queryAllFeedService;
    private final UpdateFeedService updateFeedService;


    @PostMapping("")
    public void createFeed(@RequestBody @Valid FeedRequest request) {
        createFeedService.createFeed(request);
    }

    @GetMapping("{accountId}")
    public List<FeedListResponse> queryMyFeed(@PathVariable String accountId) {
        return queryMyFeedService.queryMyFeed(accountId);
    }

    @GetMapping("")
    public List<FeedListResponse> queryAllFeed() {
        return queryAllFeedService.queryAllFeed();
    }

    @PatchMapping("/{title}")
    public void updateFeed(@PathVariable String title, @RequestBody @Valid FeedRequest request) {
        updateFeedService.updateFeed(title, request);
    }
}

