package com.example.springboot_practice.domain.heart.domain.repository;

import com.example.springboot_practice.domain.feed.domain.Feed;
import com.example.springboot_practice.domain.heart.domain.Heart;
import com.example.springboot_practice.domain.user.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeartRepository extends CrudRepository<Heart, Long> {
    boolean existsHeartByUserAndFeed(User user, Feed feed);
    void deleteHeartByUserAndFeed(User user, Feed feed);
}
