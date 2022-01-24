package com.commercetools.sdk.examples.spring.config;

import com.commercetools.sdk.examples.spring.service.CtpReactiveAuthenticationManager;
import io.vrap.rmf.base.client.ApiHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authorization.AuthorizationContext;
import reactor.core.publisher.Mono;

@Configuration
@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
public class CtpSecurityConfig {
    private final ApiHttpClient client;

    private final CtpReactiveAuthenticationManager authenticationManager;

    @Autowired
    public CtpSecurityConfig(ApiHttpClient client, CtpReactiveAuthenticationManager authenticationManager) {
        this.client = client;
        this.authenticationManager = authenticationManager;
    }

    @Bean
    SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) throws Exception {
        return http
                .authorizeExchange()
                .pathMatchers("/").permitAll()
                .pathMatchers("/home").permitAll()
                .pathMatchers( "/p/**").permitAll()
                .anyExchange().access(this::currentUserMatchesPath).and()
                .build();
    }

    private Mono<AuthorizationDecision> currentUserMatchesPath(Mono<Authentication> authentication, AuthorizationContext context) {
        return authentication
                .map(authenticationManager::authenticate)
                .map( am -> am
                            .map(a -> context.getVariables().get("user").equals(a.getName()))
                            .map(aBoolean -> new AuthorizationDecision(aBoolean))
                );
    }

    @Bean
    public MapReactiveUserDetailsService userDetailsService() {
        UserDetails rob = User.withUsername("test").password("test123").roles("USER").build();
        UserDetails admin = User.withUsername("admin").password("admin123").roles("USER","ADMIN").build();
        return new MapReactiveUserDetailsService(rob, admin);
    }
}
