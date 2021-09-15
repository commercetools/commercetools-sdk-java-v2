
package io.vrap.rmf.base.client.oauth2;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.utils.ClientUtils;

public class TokenStorageSupplier implements RefreshableTokenSupplier {
    private final TokenStorage storage;
    private final AnonymousFlowTokenSupplier anonymousFlowTokenSupplier;
    private final Object lock = new Object();
    public static final Duration WAIT_TIMEOUT = Duration.ofSeconds(5);
    private final Duration waitTimeout;

    public TokenStorageSupplier(TokenStorage storage, AnonymousFlowTokenSupplier supplier) {
        this(storage, supplier, WAIT_TIMEOUT);
    }

    public TokenStorageSupplier(TokenStorage storage, AnonymousFlowTokenSupplier supplier, Duration waitTimeout) {
        this.storage = storage;
        this.anonymousFlowTokenSupplier = supplier;
        this.waitTimeout = waitTimeout;
    }

    @Override
    public CompletableFuture<AuthenticationToken> getToken() {
        AuthenticationToken token = storage.getToken();
        if (token == null || token.isExpired()) {
            synchronized (lock) {
                token = storage.getToken();
                if (token != null && token.isExpired() && token.getRefreshToken() != null) {
                    token = getRefreshToken();
                }
                else {
                    token = getAnonToken();
                }
                storage.setToken(token);
            }
        }
        return CompletableFuture.completedFuture(token);
    }

    private AuthenticationToken getAnonToken() {
        return ClientUtils.blockingWait(anonymousFlowTokenSupplier.getToken(), waitTimeout);
    }

    private AuthenticationToken getRefreshToken() {
        return ClientUtils.blockingWait(anonymousFlowTokenSupplier.refreshToken(), waitTimeout);
    }

    @Override
    public CompletableFuture<AuthenticationToken> refreshToken() {
        AuthenticationToken token = storage.getToken();

        if (token != null) {
            synchronized (lock) {
                token = storage.getToken();
                if (token != null && token.isExpired()) {
                    token = getRefreshToken();
                    storage.setToken(token);
                }
            }
            return CompletableFuture.completedFuture(token);
        }

        return getToken();
    }
}
