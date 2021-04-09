
package io.vrap.rmf.base.client.oauth2;

import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.ClientBuilder;

@FunctionalInterface
public interface TokenSupplier {
    String LOGGER_AUTH = ClientBuilder.COMMERCETOOLS + ".auth";

    CompletableFuture<AuthenticationToken> getToken();

}
