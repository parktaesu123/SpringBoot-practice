package com.example.springboot_practice.domain.heart.application;

import com.example.springboot_practice.domain.feed.application.facade.FeedFacade;
import com.example.springboot_practice.domain.feed.domain.Feed;
import com.example.springboot_practice.domain.heart.application.facade.HeartFacade;
import com.example.springboot_practice.domain.heart.domain.Heart;
import com.example.springboot_practice.domain.heart.domain.repository.HeartRepository;
import com.example.springboot_practice.domain.heart.presentation.dto.response.HeartResponse;
import com.example.springboot_practice.domain.notification.application.SendNotificationService;
import com.example.springboot_practice.domain.notification.application.facade.NotificationFacade;
import com.example.springboot_practice.domain.notification.domain.enums.NotificationType;
import com.example.springboot_practice.domain.notification.presentation.dto.NotificationRequest;
import com.example.springboot_practice.domain.user.application.facade.UserFacade;
import com.example.springboot_practice.domain.user.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class HeartService {
    private final UserFacade userFacade;
    private final FeedFacade feedFacade;
    private final HeartFacade heartFacade;
    private final HeartRepository heartRepository;
    private final SendNotificationService sendNotificationService;
    private final NotificationFacade notificationFacade;

    @Transactional
    public HeartResponse heartService(String title) {
        User user = userFacade.currentUser();
        Feed feed = feedFacade.getFeeds(title);
        User feedOwner = feed.getUser();

        if (heartFacade.checkHeart(user, feed)) {
            feed.cancelHeart();
            heartRepository.deleteHeartByUserAndFeed(user, feed);
        } else {
            feed.pressHeart();
            heartRepository.save(Heart.builder()
                            .user(user)
                            .feed(feed)
                    .build());

            if (!user.equals(feedOwner)) {
                sendNotificationService.sendNotification(new NotificationRequest(
                        feedOwner.getUserName(),
                        user.getUserName() + "님이 하트를 눌렀습니다.",
                        NotificationType.HEART,
                        notificationFacade.checkRead(feedOwner)));
            }
        }

        return HeartResponse.builder()
                .heart(feed.getHeartCounts())
                .heartStatus(heartFacade.checkHeart(user, feed))
                .build();

    }
}
