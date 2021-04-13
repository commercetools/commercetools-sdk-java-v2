
package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.AutoCloseableService;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

public class OAuthHandler extends AutoCloseableService {
    private final TokenSupplier supplier;
    private AuthenticationToken token;

    public OAuthHandler(final TokenSupplier supplier) {
        this.supplier = supplier;
    }

    static String authHeader(final AuthenticationToken token) {
        return "Bearer " + token.getAccessToken();
    }

    public AuthenticationToken getToken() {
        if (token == null || token.isExpired())
            synchronized (this) {
                if (token == null || token.isExpired())
                    supplier.getToken().thenApply(authenticationToken -> token = authenticationToken).join();
            }
        return token;
    }

    public AuthenticationToken refreshToken() {
        token = null;
        return getToken();
    }

    @Override
    protected void internalClose() {
        if (supplier instanceof AutoCloseable)
            closeQuietly((AutoCloseable) supplier);
    }
}
