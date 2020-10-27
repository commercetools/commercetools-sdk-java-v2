package io.vrap.rmf.base.client.oauth2;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.ClientFactory;

import java.util.concurrent.CompletableFuture;

@FunctionalInterface
public interface TokenSupplier {
    String LOGGER_AUTH = ClientFactory.COMMERCETOOLS + ".auth";

    CompletableFuture<AuthenticationToken> getToken();

}
