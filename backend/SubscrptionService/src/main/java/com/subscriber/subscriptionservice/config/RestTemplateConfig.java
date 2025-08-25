package com.subscriber.subscriptionservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;

@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced   // 👈 This enables Eureka + LoadBalancer for service-to-service calls
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
