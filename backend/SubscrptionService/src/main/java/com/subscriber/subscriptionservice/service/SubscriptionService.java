package com.subscriber.subscriptionservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.subscriber.subscriptionservice.entity.Subscription;
import com.subscriber.subscriptionservice.repository.SubscriptionRepository;

@Service
public class SubscriptionService {
	

    private final SubscriptionRepository subscriptionRepository;
    
    @Autowired 
    private final RestTemplate restTemplate;

    public SubscriptionService(SubscriptionRepository subscriptionRepository, RestTemplate restTemplate) {
        this.subscriptionRepository = subscriptionRepository;
        this.restTemplate = restTemplate;
    }

    // Call USER-SERVICE via Eureka
    public String getUserDetails(Long userId) {
        String url = "http://USER-SERVICE/users/" + userId;
        return restTemplate.getForObject(url, String.class);
    }

    // Create subscription
    public Subscription createSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    // Get all subscriptions
    public List<Subscription> getAllSubscriptions() {
        return subscriptionRepository.findAll();
    }

    // Get subscription by id
    public Optional<Subscription> getSubscriptionById(Long id) {
        return subscriptionRepository.findById(id);
    }

    // Delete subscription by id
    public void deleteSubscription(Long id) {
        subscriptionRepository.deleteById(id);
    }
}

