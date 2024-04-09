package com.commercetools.sdk.examples.springmvc.config;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.MapSession;
import org.springframework.session.ReactiveMapSessionRepository;
import org.springframework.session.ReactiveSessionRepository;
import org.springframework.session.config.annotation.web.server.EnableSpringWebSession;
import org.springframework.web.server.session.CookieWebSessionIdResolver;
import org.springframework.web.server.session.WebSessionIdResolver;

@EnableSpringWebSession
@Configuration
public class SessionConfig {
    public static final String SESSION_ACCESS_TOKEN = "ctp.token.access";
    public static final String SESSION_REFRESH_TOKEN = "ctp.token.refresh";

    @Bean
    public ReactiveSessionRepository<MapSession> reactiveSessionRepository() {
        return new ReactiveMapSessionRepository(new ConcurrentHashMap<>());
    }

    @Bean
    public WebSessionIdResolver webSessionIdResolver() {
        CookieWebSessionIdResolver resolver = new CookieWebSessionIdResolver();
        resolver.setCookieName("JSESSIONID");
        resolver.addCookieInitializer((builder) -> builder.httpOnly(true).path("/").sameSite("Strict"));
        return resolver;
    }
}
