package com.commercetools.sdk.examples.spring.securingweb;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.MapSession;
import org.springframework.session.ReactiveMapSessionRepository;
import org.springframework.session.ReactiveSessionRepository;
import org.springframework.session.config.annotation.web.server.EnableSpringWebSession;

import java.util.concurrent.ConcurrentHashMap;

@EnableSpringWebSession
@Configuration
public class SessionConfig {
    @Bean
    public ReactiveSessionRepository<MapSession> reactiveSessionRepository() {
        return new ReactiveMapSessionRepository(new ConcurrentHashMap<>());
    }
}
