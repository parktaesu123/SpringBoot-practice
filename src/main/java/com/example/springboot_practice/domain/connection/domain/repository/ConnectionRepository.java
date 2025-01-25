package com.example.springboot_practice.domain.connection.domain.repository;

import com.example.springboot_practice.domain.connection.domain.Connection;
import com.example.springboot_practice.domain.user.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRepository extends CrudRepository<Connection, Long> {
    boolean existsConnectionByUserAndTargetUser(User user, User targetUser);
}
