package com.subscriber.planservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subscriber.planservice.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Long> {
}
