package com.example.springboot_practice.domain.comment.domain.repository;

import com.example.springboot_practice.domain.comment.domain.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long>, CommentRepositoryCustom {
}
