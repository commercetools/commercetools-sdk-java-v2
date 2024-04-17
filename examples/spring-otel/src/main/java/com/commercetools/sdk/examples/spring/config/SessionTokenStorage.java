
package com.commercetools.sdk.examples.spring.config;

import java.time.Duration;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.oauth2.TokenStorage;

import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

public class SessionTokenStorage implements TokenStorage {
    private final Mono<WebSession> session;

    public SessionTokenStorage(Mono<WebSession> session) {
        this.session = session;
    }

    @Override
    public AuthenticationToken getToken() {
        WebSession s = session.block(Duration.ofMillis(500));
        assert s != null;
        final String accessToken = s.getAttribute(SessionConfig.SESSION_ACCESS_TOKEN);
        final String refreshToken = s.getAttribute(SessionConfig.SESSION_REFRESH_TOKEN);
        if (accessToken == null) {
            return null;
        }
        System.out.println(accessToken);

        AuthenticationToken token = new AuthenticationToken();
        token.setAccessToken(accessToken);
        token.setRefreshToken(refreshToken);
        return token;
    }

    @Override
    public void setToken(AuthenticationToken token) {
        session.blockOptional(Duration.ofMillis(500)).ifPresent(s -> {
            s.getAttributes().put(SessionConfig.SESSION_ACCESS_TOKEN, token.getAccessToken());
            s.getAttributes().put(SessionConfig.SESSION_REFRESH_TOKEN, token.getRefreshToken());
            s.save();
        });
    }
}
