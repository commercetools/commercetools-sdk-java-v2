
package io.vrap.rmf.base.client.oauth2;

import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.AuthenticationToken;

public class StaticTokenSupplier implements TokenSupplier {

    private final AuthenticationToken token;

    public StaticTokenSupplier(final AuthenticationToken token) {
        this.token = token;
    }

    @Override
    public CompletableFuture<AuthenticationToken> getToken() {
        return CompletableFuture.completedFuture(this.token);
    }
}
