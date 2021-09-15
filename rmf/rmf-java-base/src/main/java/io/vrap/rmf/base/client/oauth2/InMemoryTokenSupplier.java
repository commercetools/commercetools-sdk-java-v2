
package io.vrap.rmf.base.client.oauth2;

import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.AutoCloseableService;

public class InMemoryTokenSupplier extends AutoCloseableService implements RefreshableTokenSupplier {
    private final TokenSupplier supplier;
    private final Object lock = new Object();
    private volatile CompletableFuture<AuthenticationToken> tokenFuture;

    public InMemoryTokenSupplier(TokenSupplier tokenSupplier) {
        this.supplier = tokenSupplier;
    }

    public CompletableFuture<AuthenticationToken> getToken() {
        if (tokenFuture == null)
            synchronized (lock) {
                if (tokenFuture == null) {
                    tokenFuture = supplier.getToken();
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
