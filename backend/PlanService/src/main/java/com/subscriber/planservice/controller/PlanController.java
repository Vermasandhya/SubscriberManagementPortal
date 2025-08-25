package com.subscriber.planservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subscriber.planservice.entity.Plan;
import com.subscriber.planservice.service.PlanService;

@RestController
@RequestMapping("/plans")
public class PlanController {

    private final PlanService planService;

    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    @PostMapping
    public Plan createPlan(@RequestBody Plan plan) {
        return planService.createPlan(plan);
    }

    @GetMapping
    public List<Plan> getAllPlans() {
        return planService.getAllPlans();
    }

    @GetMapping("/{id}")
    public Optional<Plan> getPlanById(@PathVariable Long id) {
        return planService.getPlanById(id);
    }

    @DeleteMapping("/{id}")
    public String deletePlan(@PathVariable Long id) {
        planService.deletePlan(id);
        return "Plan deleted successfully!";
    }
}
