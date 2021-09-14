
package io.vrap.rmf.base.client.oauth2;

import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.AuthenticationToken;

/**
 * Token supplier using a specified token
 */
public class StaticTokenSupplier implements RefreshableTokenSupplier {

    private final AuthenticationToken token;

    public StaticTokenSupplier(final AuthenticationToken token) {
        this.token = token;
    }

    @Override
    public CompletableFuture<AuthenticationToken> getToken() {
        return CompletableFuture.completedFuture(this.token);
    }

    @Override
    public CompletableFuture<AuthenticationToken> refreshToken() {
        return CompletableFuture.completedFuture(this.token);
    }
}
