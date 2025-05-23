
package com.commercetools.sdk.examples.spring.config;

import java.time.Duration;

import com.commercetools.api.client.ProjectApiRoot;
import com.commercetools.api.defaultconfig.ApiRootBuilder;
import com.commercetools.api.defaultconfig.ServiceRegion;
import com.commercetools.sdk.examples.spring.service.CtpReactiveAuthenticationManager;
import com.commercetools.sdk.examples.spring.service.MeRepository;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.oauth2.ClientCredentials;
import io.vrap.rmf.base.client.oauth2.TokenStorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.ReactiveAuthenticationManagerResolver;
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
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

@Configuration
@EnableWebFluxSecurity
@EnableReactiveMethodSecurity
public class CtpSecurityConfig {
    private final ReactiveAuthenticationManagerResolver<ServerWebExchange> authenticationManagerResolver;

    @Autowired
    public CtpSecurityConfig(
            final ReactiveAuthenticationManagerResolver<ServerWebExchange> authenticationManagerResolver) {
        this.authenticationManagerResolver = authenticationManagerResolver;
    }

    @Bean
    SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) throws Exception {
        ServerSecurityContextRepository securityContextRepository = new WebSessionServerSecurityContextRepository();
        return http.securityContextRepository(securityContextRepository)
                .anonymous(anonymous -> anonymous.authorities("ROLE_ANON"))
                .addFilterBefore(new LoginWebFilter(authenticationManagerResolver, securityContextRepository),
                    SecurityWebFiltersOrder.FORM_LOGIN)
                .logout(logoutSpec -> logoutSpec
                        .logoutUrl("/logout")
                        .requiresLogout(ServerWebExchangeMatchers.pathMatchers(HttpMethod.GET, "/logout"))
                        .logoutSuccessHandler(new RedirectServerLogoutSuccessHandler())
                        .logoutHandler(new DelegatingServerLogoutHandler(new WebSessionServerLogoutHandler(), new SecurityContextServerLogoutHandler()))
                )
                .formLogin(formLoginSpec -> formLoginSpec
                        .loginPage("/login")
                        .requiresAuthenticationMatcher(ServerWebExchangeMatchers.pathMatchers("none"))
                        .authenticationManager(Mono::just)
                )
                .authorizeExchange(authorizeExchangeSpec -> authorizeExchangeSpec
                        .pathMatchers("/login").permitAll()
                        .pathMatchers("/").permitAll()
                        .pathMatchers("/resources/**").permitAll()
                        .pathMatchers("/home").permitAll()
                        .pathMatchers("/p/**").permitAll()
                        .pathMatchers("/cart/**").permitAll()
                        .pathMatchers("/me/**").authenticated()
                        .anyExchange().authenticated()
                )
                .build();
    }

    @Component
    public static class CtpReactiveAuthenticationManagerResolver
            implements ReactiveAuthenticationManagerResolver<ServerWebExchange> {
        private final ApiHttpClient apiHttpClient;

        @Value(value = "${ctp.client.id}")
        private String clientId;

        @Value(value = "${ctp.client.secret}")
        private String clientSecret;

        @Value(value = "${ctp.project.key}")
        private String projectKey;

        @Value(value = "${ctp.project.api.base.url:#{null}}")
        private String apiBaseUrl;

        @Value(value = "${ctp.project.auth.url:#{null}}")
        private String authUrl;

        private final ServiceRegion serviceRegion;

        private ClientCredentials credentials() {
            return ClientCredentials.of().withClientId(clientId).withClientSecret(clientSecret).build();
        }

        @Autowired
        public CtpReactiveAuthenticationManagerResolver(final ApiHttpClient apiHttpClient, final ServiceRegion serviceRegion) {
            this.apiHttpClient = apiHttpClient;
            this.serviceRegion = serviceRegion;
        }

        @Override
        public Mono<ReactiveAuthenticationManager> resolve(final ServerWebExchange context) {
            return Mono.just(new CtpReactiveAuthenticationManager(meClient(apiHttpClient, context.getSession()),
                credentials(), projectKey, authUrl, serviceRegion));
        }

        private ProjectApiRoot meClient(final ApiHttpClient client, final Mono<WebSession> session) {
            TokenStorage storage = new SessionTokenStorage(session);

            ApiRootBuilder builder = ApiRootBuilder.of(client)
                    .withApiBaseUrl(apiBaseUrl != null ? apiBaseUrl : serviceRegion.getApiUrl())
                    .withProjectKey(projectKey);

            if (authUrl != null) {
                builder = builder.withAnonymousRefreshFlow(credentials(),
                    authUrl + "/oauth/" + projectKey + "/anonymous/token", authUrl + "/oauth/token", storage);
            }
            else {
                builder = builder.withAnonymousRefreshFlow(credentials(), serviceRegion, storage);
            }

            return builder.build(projectKey);
        }
    }

    public static class LoginWebFilter extends AuthenticationWebFilter {
        public LoginWebFilter(ReactiveAuthenticationManagerResolver<ServerWebExchange> authenticationManager,
                ServerSecurityContextRepository securityContextRepository) {
            super(authenticationManager);
            setServerAuthenticationConverter(new ServerFormLoginAuthenticationConverter());
            setRequiresAuthenticationMatcher(ServerWebExchangeMatchers.pathMatchers(HttpMethod.POST, "/login"));
            setAuthenticationFailureHandler(new RedirectServerAuthenticationFailureHandler("/login?error"));
            setAuthenticationSuccessHandler(new WebFilterChainServerAuthenticationSuccessHandler());
            setSecurityContextRepository(securityContextRepository);
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
