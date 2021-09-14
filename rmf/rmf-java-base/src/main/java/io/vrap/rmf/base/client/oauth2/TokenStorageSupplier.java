
package io.vrap.rmf.base.client.oauth2;

import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.AuthenticationToken;

public class TokenStorageSupplier implements RefreshableTokenSupplier {
    private final TokenStorage storage;
    private final AnonymousFlowTokenSupplier anonymousFlowTokenSupplier;

    public TokenStorageSupplier(TokenStorage storage, AnonymousFlowTokenSupplier supplier) {
        this.storage = storage;
        this.anonymousFlowTokenSupplier = supplier;
    }

    @Override
    public CompletableFuture<AuthenticationToken> getToken() {
        AuthenticationToken token = storage.getToken();
        if (token != null) {
            if (token.getAccessToken() != null && !token.isExpired()) {
                return CompletableFuture.completedFuture(token);
            }
            if (token.getRefresherToken() != null) {
                return refreshToken();
            }
        }
        return anonymousFlowTokenSupplier.getToken().thenApply(anonToken -> {
            storage.setToken(anonToken);
            return anonToken;
        });
    }

    @Override
    public CompletableFuture<AuthenticationToken> refreshToken() {
        return anonymousFlowTokenSupplier.refreshToken().thenApply(token -> {
            storage.setToken(token);
            return token;
        });
    }
}
