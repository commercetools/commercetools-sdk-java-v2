
package com.commercetools.sdk.examples.spring.config;

import java.time.Duration;

import com.commercetools.api.models.cart.CartResourceIdentifierBuilder;
import com.commercetools.sdk.examples.spring.service.MeRepository;

import io.vrap.rmf.base.client.oauth2.TokenStorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.SecurityWebFiltersOrder;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.WebFilterExchange;
import org.springframework.security.web.server.authentication.*;
import org.springframework.security.web.server.authentication.logout.*;
import org.springframework.security.web.server.context.ServerSecurityContextRepository;
import org.springframework.security.web.server.context.WebSessionServerSecurityContextRepository;
import org.springframework.security.web.server.util.matcher.ServerWebExchangeMatchers;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

@Configuration
@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
public class CtpSecurityConfig {
    private final ReactiveAuthenticationManager authenticationManager;

    @Autowired
    public CtpSecurityConfig(ReactiveAuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Bean
    SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) throws Exception {
        ServerSecurityContextRepository securityContextRepository = new WebSessionServerSecurityContextRepository();
        return http.securityContextRepository(securityContextRepository)
                .anonymous()
                .and()
                .addFilterBefore(new LoginWebFilter(authenticationManager, securityContextRepository),
                    SecurityWebFiltersOrder.FORM_LOGIN)
                .logout()
                .logoutUrl("/logout")
                .requiresLogout(ServerWebExchangeMatchers.pathMatchers(HttpMethod.GET, "/logout"))
                .logoutHandler(new DelegatingServerLogoutHandler(new WebSessionServerLogoutHandler(),
                    new SecurityContextServerLogoutHandler()))
                .logoutSuccessHandler(new RedirectServerLogoutSuccessHandler())
                .and()
                .formLogin()
                .loginPage("/login")
                .requiresAuthenticationMatcher(ServerWebExchangeMatchers.pathMatchers("none"))
                .authenticationManager(Mono::just)
                .and()
                .authorizeExchange()
                .pathMatchers("/login")
                .permitAll()
                .pathMatchers("/")
                .permitAll()
                .pathMatchers("/resources/**")
                .permitAll()
                .pathMatchers("/home")
                .permitAll()
                .pathMatchers("/p/**")
                .permitAll()
                .pathMatchers("/cart/**")
                .permitAll()
                .pathMatchers("/me/**")
                .authenticated()
                .anyExchange()
                .authenticated()
                .and()
                .build();
    }

    public static class LoginWebFilter extends AuthenticationWebFilter {
        public LoginWebFilter(ReactiveAuthenticationManager authenticationManager,
                ServerSecurityContextRepository securityContextRepository) {
            super(authenticationManager);
            setServerAuthenticationConverter(new CtpServerAuthenticationConverter());
            setRequiresAuthenticationMatcher(ServerWebExchangeMatchers.pathMatchers(HttpMethod.POST, "/login"));
            setAuthenticationFailureHandler(new RedirectServerAuthenticationFailureHandler("/login?error"));
            setAuthenticationSuccessHandler(new WebFilterChainServerAuthenticationSuccessHandler());
            setSecurityContextRepository(securityContextRepository);
        }
    }

    private static class CtpServerAuthenticationConverter extends ServerFormLoginAuthenticationConverter
            implements ServerAuthenticationConverter {
        @Override
        public Mono<Authentication> convert(ServerWebExchange exchange) {
            return super.convert(exchange).flatMap(authentication -> {
                Mono<WebSession> webSession = exchange.getSession();
                return webSession.map(session -> {
                    Object cart = session.getAttribute(MeRepository.SESSION_CART);
                    if (cart != null) {
                        return new CustomerAuthenticationToken(authentication,
                            CartResourceIdentifierBuilder.of().id(cart.toString()).build());
                    }
                    return authentication;
                });
            });
        }
    }

    private static class WebFilterChainServerAuthenticationSuccessHandler
            implements ServerAuthenticationSuccessHandler {

        @Override
        public Mono<Void> onAuthenticationSuccess(WebFilterExchange webFilterExchange, Authentication authentication) {
            ServerWebExchange exchange = webFilterExchange.getExchange();
            TokenStorage storage = new SessionTokenStorage(exchange.getSession());
            TokenGrantedAuthority authority = (TokenGrantedAuthority) authentication.getAuthorities()
                    .stream()
                    .filter(grantedAuthority -> grantedAuthority instanceof TokenGrantedAuthority)
                    .findFirst()
                    .get();
            storage.setToken(authority.getToken());

            if (authentication.getPrincipal() instanceof CtpUserDetails) {
                exchange.getSession().blockOptional(Duration.ofMillis(500)).ifPresent(session -> {
                    session.getAttributes()
                            .put(MeRepository.SESSION_CART, ((CtpUserDetails) authentication.getPrincipal()).getCart());
                    session.save();
                });
            }
            return webFilterExchange.getChain().filter(exchange);
        }
    }
}
