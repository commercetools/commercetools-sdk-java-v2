
package io.vrap.rmf.base.client.oauth2;

import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.ClientFactory;

@FunctionalInterface
public interface TokenSupplier {
    String LOGGER_AUTH = ClientFactory.COMMERCETOOLS + ".auth";

    CompletableFuture<AuthenticationToken> getToken();

}
