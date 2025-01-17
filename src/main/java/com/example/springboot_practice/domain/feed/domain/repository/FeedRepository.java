package com.example.springboot_practice.domain.feed.domain.repository;

import com.example.springboot_practice.domain.feed.domain.Feed;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FeedRepository extends CrudRepository<Feed, Long>, FeedRepositoryCustom {
    Optional<Feed> findByTitle(String title);

    void deleteByTitle(String title);
}
