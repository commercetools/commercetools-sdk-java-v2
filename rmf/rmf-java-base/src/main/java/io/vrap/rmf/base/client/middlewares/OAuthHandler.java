package io.vrap.rmf.base.client.middlewares;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.AuthenticationToken;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import java.util.concurrent.CompletableFuture;

public class OAuthHandler implements Middleware {
    private final TokenSupplier supplier;
    private AuthenticationToken token;

    public OAuthHandler(TokenSupplier supplier) {
        this.supplier = supplier;
    }

    private String authHeader() {
        return "Bearer " + getToken().getAccessToken();
    }

    public AuthenticationToken getToken() {
        if (token == null)
            synchronized (this) {
                if (token == null)
                    supplier.getToken().thenApply(authenticationToken -> token = authenticationToken).join();
            }
        return token;
    }

    public AuthenticationToken refreshToken() {
        token = null;
        return getToken();
    }

    @Override
    public CompletableFuture<MiddlewareArg> next(MiddlewareArg arg) {

        return null;
    }
}
