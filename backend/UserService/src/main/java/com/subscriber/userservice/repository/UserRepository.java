package com.subscriber.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subscriber.userservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
