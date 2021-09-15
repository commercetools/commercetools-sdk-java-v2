
package io.vrap.rmf.base.client.oauth2;

import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.http.InternalLogger;

public class TokenStorageSupplier implements RefreshableTokenSupplier {
    private final InternalLogger logger = InternalLogger.getLogger(LOGGER_AUTH);

    private final TokenStorage storage;
    private final AnonymousFlowTokenSupplier anonymousFlowTokenSupplier;
    private final Object lock = new Object();

    private volatile CompletableFuture<AuthenticationToken> tokenFuture;

    public TokenStorageSupplier(TokenStorage storage, AnonymousFlowTokenSupplier supplier) {
        this.storage = storage;
        this.anonymousFlowTokenSupplier = supplier;
    }

    @Override
    public CompletableFuture<AuthenticationToken> getToken() {
        AuthenticationToken token = storage.getToken();
        if (token != null && !token.isExpired()) {
            return CompletableFuture.completedFuture(token);
        }
        if (token != null) {
            if (token.getRefreshToken() != null) {
                synchronized (lock) {
                    if (tokenFuture == null) {
                        logger.debug(() -> "using refresh token flow");
                        tokenFuture = anonymousFlowTokenSupplier.refreshToken().thenApply(this::storeToken);
                    }
                }
            }
        }
        synchronized (lock) {
            if (tokenFuture == null) {
                logger.debug(() -> "using anonymous token flow");
                tokenFuture = anonymousFlowTokenSupplier.getToken().thenApply(this::storeToken);
            }
        }
        return tokenFuture;
    }

    private void resetTokenFuture() {
        synchronized (lock) {
            tokenFuture = null;
        }
    }

    private AuthenticationToken storeToken(AuthenticationToken token) {
        storage.setToken(token);
        resetTokenFuture();
        return token;
    }


    @Override
    public CompletableFuture<AuthenticationToken> refreshToken() {
        resetTokenFuture();
        AuthenticationToken token = storage.getToken();

        if (token != null) {
            synchronized (lock) {
                if (tokenFuture == null && token.isExpired()) {
                    logger.debug(() -> "refresh token");
                    tokenFuture = anonymousFlowTokenSupplier.refreshToken().thenApply(this::storeToken);
                }
            }
            return tokenFuture;
        }

        return getToken();
    }
}
