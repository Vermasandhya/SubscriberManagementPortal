package com.subscriber.planservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.subscriber.planservice.entity.Plan;
import com.subscriber.planservice.repository.PlanRepository;

@Service
public class PlanService {

    private final PlanRepository planRepository;

    public PlanService(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    public Plan createPlan(Plan plan) {
        return planRepository.save(plan);
    }

    public List<Plan> getAllPlans() {
        return planRepository.findAll();
    }

    public Optional<Plan> getPlanById(Long id) {
        return planRepository.findById(id);
    }

    public void deletePlan(Long id) {
        planRepository.deleteById(id);
    }
}
