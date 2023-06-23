
package io.vrap.rmf.base.client.http;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import com.spotify.futures.CompletableFutures;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.AutoCloseableService;
import io.vrap.rmf.base.client.oauth2.InMemoryTokenSupplier;
import io.vrap.rmf.base.client.oauth2.RefreshableTokenSupplier;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;
import io.vrap.rmf.base.client.utils.ClientUtils;

/**
 * Handler for retrieving an oauth authentication token
 */
public class OAuthHandler extends AutoCloseableService {
    public static final Duration WAIT_TIMEOUT = Duration.ofSeconds(5);
    private final Duration waitTimeout;
    private final RefreshableTokenSupplier supplier;

    public OAuthHandler(final TokenSupplier supplier) {
        this(supplier, WAIT_TIMEOUT);
    }

    public OAuthHandler(final TokenSupplier supplier, Duration waitTimeout) {
        if (supplier instanceof RefreshableTokenSupplier) {
            this.supplier = (RefreshableTokenSupplier) supplier;
        }
        else {
            this.supplier = new InMemoryTokenSupplier(supplier);
        }
        this.waitTimeout = waitTimeout;
    }

    static String authHeader(final AuthenticationToken token) {
        return "Bearer " + token.getAccessToken();
    }

    public AuthenticationToken getToken() {
        return ClientUtils.blockingWait(getTokenAsync(), waitTimeout);
    }

    public AuthenticationToken refreshToken() {
        return ClientUtils.blockingWait(refreshTokenAsync(), waitTimeout);
    }

    public CompletableFuture<AuthenticationToken> getTokenAsync() {
        return CompletableFutures.exceptionallyCompose(supplier.getToken().thenCompose(token -> {
            if (token.isExpired()) {
                return refreshTokenAsync();
            }
            return CompletableFuture.completedFuture(token);
        }), throwable -> refreshTokenAsync()).toCompletableFuture();
    }

    public CompletableFuture<AuthenticationToken> refreshTokenAsync() {
        return supplier.refreshToken();
    }

    @Override
    protected void internalClose() {
        if (supplier instanceof AutoCloseable)
            closeQuietly((AutoCloseable) supplier);
    }
}
