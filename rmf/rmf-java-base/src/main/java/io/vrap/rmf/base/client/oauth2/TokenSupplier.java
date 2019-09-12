package io.vrap.rmf.base.client.oauth2;

import io.vrap.rmf.base.client.AuthenticationToken;

import java.util.concurrent.CompletableFuture;

@FunctionalInterface
public interface TokenSupplier {

    CompletableFuture<AuthenticationToken> getToken();

}
