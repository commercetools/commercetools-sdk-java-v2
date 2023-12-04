
package com.commercetools.http.reactive;

import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.http.OAuthHandler;

import org.reactivestreams.Publisher;

import reactor.core.publisher.Mono;

/**
 * Default implementation for the {@link io.vrap.rmf.base.client.http.OAuthMiddleware} with automatic retry upon expired access
 */
public class OAuthMiddlewareImpl implements AutoCloseable, OAuthMiddleware {

    private final OAuthHandler authHandler;

    public OAuthMiddlewareImpl(final OAuthHandler oAuthHandler) {
        this.authHandler = oAuthHandler;

    }

    @Override
    public Publisher<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, Publisher<ApiHttpResponse<byte[]>>> next) {
        return Mono.fromCompletionStage(authHandler.getTokenAsync())
                .flatMapMany(token -> next
                        .apply(request.addHeader(ApiHttpHeaders.AUTHORIZATION, OAuthHandler.authHeader(token))));
    }

    @Override
    public void close() {
        authHandler.close();
    }
}
