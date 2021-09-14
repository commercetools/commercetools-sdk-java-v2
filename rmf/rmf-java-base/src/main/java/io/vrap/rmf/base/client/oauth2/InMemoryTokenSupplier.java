
package io.vrap.rmf.base.client.oauth2;

import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.AutoCloseableService;

public class InMemoryTokenSupplier extends AutoCloseableService implements RefreshableTokenSupplier {
    private final TokenStorage storage;
    private final TokenSupplier supplier;

    public InMemoryTokenSupplier(TokenSupplier tokenSupplier) {
        this.supplier = tokenSupplier;
        this.storage = new InMemoryTokenStorage();
    }

    public CompletableFuture<AuthenticationToken> getToken() {
        AuthenticationToken token = storage.getToken();
        if (token == null || token.isExpired())
            synchronized (this) {
                if (token == null || token.isExpired())
                    token = supplier.getToken().join();
                storage.setToken(token);
            }
        return CompletableFuture.completedFuture(token);
    }

    public CompletableFuture<AuthenticationToken> refreshToken() {
        storage.setToken(null);
        return getToken();
    }

    @Override
    protected void internalClose() {
        if (supplier instanceof AutoCloseable)
            closeQuietly((AutoCloseable) supplier);
    }
}
