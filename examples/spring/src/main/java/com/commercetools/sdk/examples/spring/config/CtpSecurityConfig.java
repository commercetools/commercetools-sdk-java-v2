package com.commercetools.sdk.examples.spring.config;

import io.vrap.rmf.base.client.oauth2.TokenStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.WebFilterExchange;
import org.springframework.security.web.server.authentication.ServerAuthenticationConverter;
import org.springframework.security.web.server.authentication.ServerAuthenticationSuccessHandler;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Configuration
@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
public class CtpSecurityConfig {
    //    private final ApiHttpClient client;
    //
    //    private final CtpReactiveAuthenticationManager authenticationManager;

    @Autowired public CtpSecurityConfig() {
        //    public CtpSecurityConfig(ApiHttpClient client, CtpReactiveAuthenticationManager authenticationManager) {
        //        this.client = client;
        //        this.authenticationManager = authenticationManager;
    }

    @Bean SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) throws Exception {
        return http.formLogin()
                .authenticationSuccessHandler(new WebFilterChainServerAuthenticationSuccessHandler())
                .authenticationFailureHandler(((webFilterExchange, exception) -> Mono.error(exception)))
                .and()
                .authorizeExchange()
                .pathMatchers("/").permitAll()
                .pathMatchers("/home").permitAll()
                .pathMatchers("/p/**").permitAll()
                .pathMatchers("/cart/**").permitAll()
                .pathMatchers("/me/**").authenticated()
                .anyExchange().authenticated().and()
                .build();
    }

    @SuppressWarnings("deprecation")
    private static class CtpServerAuthenticationConverter extends org.springframework.security.web.server.ServerFormLoginAuthenticationConverter
            implements ServerAuthenticationConverter {

        @Override public Mono<Authentication> convert(ServerWebExchange exchange) {
            return apply(exchange);
        }
    }

    private static class WebFilterChainServerAuthenticationSuccessHandler implements ServerAuthenticationSuccessHandler {

        @Override public Mono<Void> onAuthenticationSuccess(WebFilterExchange webFilterExchange, Authentication authentication) {
            ServerWebExchange exchange = webFilterExchange.getExchange();
            TokenStorage storage = new SessionTokenStorage(exchange.getSession());
            TokenGrantedAuthority authority = (TokenGrantedAuthority) authentication.getAuthorities()
                    .stream()
                    .filter(grantedAuthority -> grantedAuthority instanceof TokenGrantedAuthority)
                    .findFirst()
                    .get();
            storage.setToken(authority.getToken());
            return webFilterExchange.getChain().filter(exchange);
        }

    }
}
