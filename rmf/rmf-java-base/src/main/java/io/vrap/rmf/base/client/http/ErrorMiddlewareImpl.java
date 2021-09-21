
package io.vrap.rmf.base.client.http;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.HttpExceptionFactory;

/**
 * Default implementation of an {@link ErrorMiddleware} to create exceptions based on the HTTP status code
 */
class ErrorMiddlewareImpl implements ErrorMiddleware {
    private final HttpExceptionFactory exceptionFactory;

    @Deprecated
    public ErrorMiddlewareImpl(final ResponseSerializer serializer) {
        this.exceptionFactory = HttpExceptionFactory.of(serializer);
    }

    public ErrorMiddlewareImpl(HttpExceptionFactory exceptionFactory) {
        this.exceptionFactory = exceptionFactory;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return next.apply(request).thenApply(response -> {
            if (response.getStatusCode() >= 400) {
                throw exceptionFactory.create(request, response);
            }
            return response;
        });
    }

}
