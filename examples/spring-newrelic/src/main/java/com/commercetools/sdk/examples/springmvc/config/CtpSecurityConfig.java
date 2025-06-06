
package com.commercetools.sdk.examples.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.context.ServerSecurityContextRepository;
import org.springframework.security.web.server.context.WebSessionServerSecurityContextRepository;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class CtpSecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .anonymous(anonymous -> anonymous.authorities("ROLE_ANON"))
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("**").permitAll()
                        .requestMatchers("/resources/**").permitAll()
                        .anyRequest().permitAll()
                );

        return http.build();
    }
}
