
package io.vrap.rmf.base.client.http;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.ExceptionFactory;

/**
 * Default implementation of an {@link ErrorMiddleware} to create exceptions based on the HTTP status code
 */
class ErrorMiddlewareImpl implements ErrorMiddleware {
    private final ResponseSerializer serializer;

    public ErrorMiddlewareImpl(final ResponseSerializer serializer) {
        this.serializer = serializer;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return next.apply(request).thenApply(response -> {
            if (response.getStatusCode() >= 400) {
                throw ExceptionFactory.create(request, response, serializer);
            }
            return response;
        });
    }

}
