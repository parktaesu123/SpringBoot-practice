package com.example.springboot_practice.feed.domain.repository;

import com.example.springboot_practice.feed.domain.Feed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedRepository extends CrudRepository<Feed, Long>, FeedRepositoryCustom {
}
