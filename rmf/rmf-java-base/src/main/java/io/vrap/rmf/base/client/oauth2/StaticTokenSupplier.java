package io.vrap.rmf.base.client.oauth2;

import io.vrap.rmf.base.client.AuthenticationToken;

import java.util.concurrent.CompletableFuture;

public class StaticTokenSupplier implements TokenSupplier {

    private final AuthenticationToken token;

    public StaticTokenSupplier(AuthenticationToken token) {
        this.token = token;
    }

    @Override
    public CompletableFuture<AuthenticationToken> getToken() {
        return CompletableFuture.completedFuture(this.token);
    }
}
