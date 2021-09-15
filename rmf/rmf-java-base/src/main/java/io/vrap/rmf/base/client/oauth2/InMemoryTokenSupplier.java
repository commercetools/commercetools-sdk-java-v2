
package io.vrap.rmf.base.client.oauth2;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.AutoCloseableService;
import io.vrap.rmf.base.client.utils.ClientUtils;

public class InMemoryTokenSupplier extends AutoCloseableService implements RefreshableTokenSupplier {
    private AuthenticationToken token;
    private final TokenSupplier supplier;
    private final Object lock = new Object();
    public static final Duration WAIT_TIMEOUT = Duration.ofSeconds(5);
    private final Duration waitTimeout;

    public InMemoryTokenSupplier(TokenSupplier tokenSupplier) {
        this(tokenSupplier, WAIT_TIMEOUT);
    }

    public InMemoryTokenSupplier(TokenSupplier tokenSupplier, Duration waitTimeout) {
        this.supplier = tokenSupplier;
        this.waitTimeout = waitTimeout;
    }

    public CompletableFuture<AuthenticationToken> getToken() {
        if (token == null || token.isExpired())
            synchronized (lock) {
                if (token == null || token.isExpired()) {
                    token = ClientUtils.blockingWait(supplier.getToken(), waitTimeout);
                }
            }
        return CompletableFuture.completedFuture(token);
    }

    public CompletableFuture<AuthenticationToken> refreshToken() {
        synchronized (lock) {
            token = null;
        }
        return getToken();
    }

    @Override
    protected void internalClose() {
        if (supplier instanceof AutoCloseable)
            closeQuietly((AutoCloseable) supplier);
    }
}
