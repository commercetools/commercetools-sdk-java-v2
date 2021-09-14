
package io.vrap.rmf.base.client.oauth2;

import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.AuthenticationToken;

public interface RefreshableTokenSupplier extends TokenSupplier {
    CompletableFuture<AuthenticationToken> refreshToken();
}
