
package io.vrap.rmf.base.client.http;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.function.Function;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.HttpExceptionFactory;

/**
 * Default implementation of an {@link ErrorMiddleware} to create exceptions based on the HTTP status code
 */
class ErrorMiddlewareImpl implements ErrorMiddleware {
    private final HttpExceptionFactory exceptionFactory;
    private final ExceptionMode exceptionMode;

    @Deprecated
    public ErrorMiddlewareImpl(final ResponseSerializer serializer) {
        this(HttpExceptionFactory.of(serializer));
    }

    public ErrorMiddlewareImpl(HttpExceptionFactory exceptionFactory) {
        this(exceptionFactory, ExceptionMode.COMPLETION_EXCEPTION);
    }

    public ErrorMiddlewareImpl(HttpExceptionFactory exceptionFactory, ExceptionMode mode) {
        this.exceptionFactory = exceptionFactory;
        this.exceptionMode = mode;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        if (exceptionMode == ExceptionMode.COMPLETION_EXCEPTION) {
            return next.apply(request).thenApply(response -> {
                if (response.getStatusCode() >= 400) {
                    throw exceptionFactory.create(request, response);
                }
                return response;
            });
        }

        CompletableFuture<ApiHttpResponse<byte[]>> result = new CompletableFuture<>();
        next.apply(request).whenComplete((response, throwable) -> {
            if (throwable != null) {
                Throwable unwrap = throwable instanceof CompletionException ? throwable.getCause() : throwable;
                result.completeExceptionally(unwrap);
            }
            if (response != null) {
                if (response.getStatusCode() >= 400) {
                    result.completeExceptionally(exceptionFactory.create(request, response));
                }
            }
            result.complete(response);
        });

        return result;
    }

}
