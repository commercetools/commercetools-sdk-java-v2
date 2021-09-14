
package io.vrap.rmf.base.client.http;

import java.time.Duration;

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
    private final Duration waitTimeout;
    private final RefreshableTokenSupplier supplier;

    public OAuthHandler(final TokenSupplier supplier) {
        this(new InMemoryTokenSupplier(supplier), Duration.ofSeconds(5));
    }

    public OAuthHandler(RefreshableTokenSupplier supplier, Duration waitTimeout) {
        this.waitTimeout = waitTimeout;
        this.supplier = new InMemoryTokenSupplier(supplier);
    }

    static String authHeader(final AuthenticationToken token) {
        return "Bearer " + token.getAccessToken();
    }

    public AuthenticationToken getToken() {
        return ClientUtils.blockingWait(supplier.getToken(), waitTimeout);
    }

    public AuthenticationToken refreshToken() {
        return ClientUtils.blockingWait(supplier.refreshToken(), waitTimeout);
    }

    @Override
    protected void internalClose() {
        if (supplier instanceof AutoCloseable)
            closeQuietly((AutoCloseable) supplier);
    }
}
