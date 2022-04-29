
package io.vrap.rmf.base.client.oauth2;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import dev.failsafe.Failsafe;
import dev.failsafe.FailsafeExecutor;
import dev.failsafe.Timeout;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.AutoCloseableService;

public class InMemoryTokenSupplier extends AutoCloseableService implements RefreshableTokenSupplier {
    private final TokenSupplier supplier;
    private final Object lock = new Object();
    private volatile CompletableFuture<AuthenticationToken> tokenFuture;

    private final FailsafeExecutor<AuthenticationToken> failsafeExecutor;

    public InMemoryTokenSupplier(TokenSupplier tokenSupplier) {
        this.supplier = tokenSupplier;
        this.failsafeExecutor = Failsafe.with(Timeout.of(Duration.ofSeconds(10)));
    }

    public CompletableFuture<AuthenticationToken> getToken() {
        if (tokenFuture == null)
            synchronized (lock) {
                if (tokenFuture == null) {
                    failsafeExecutor
                            .run(() -> tokenFuture = CompletableFuture.completedFuture(supplier.getToken().join()));
                }
            }
        return tokenFuture;
    }

    public CompletableFuture<AuthenticationToken> refreshToken() {
        synchronized (lock) {
            tokenFuture = null;
        }
        return getToken();
    }

    @Override
    protected void internalClose() {
        if (supplier instanceof AutoCloseable)
            closeQuietly((AutoCloseable) supplier);
    }
}
