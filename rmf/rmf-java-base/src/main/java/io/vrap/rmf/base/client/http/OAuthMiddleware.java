package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.AuthenticationToken;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class OAuthMiddleware implements Middleware {
    private final OAuthHandler authHandler;

    public OAuthMiddleware(OAuthHandler authHandler) {
        this.authHandler = authHandler;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request, Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        AuthenticationToken token = authHandler.getToken();
        request.addHeader(ApiHttpHeaders.AUTHORIZATION, OAuthHandler.authHeader(token));
        return next.apply(request);
    }
}
