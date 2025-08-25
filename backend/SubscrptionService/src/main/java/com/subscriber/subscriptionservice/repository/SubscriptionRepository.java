package com.subscriber.subscriptionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subscriber.subscriptionservice.entity.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
