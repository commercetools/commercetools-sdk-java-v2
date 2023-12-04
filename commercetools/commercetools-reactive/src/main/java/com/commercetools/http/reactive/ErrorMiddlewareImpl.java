
package com.commercetools.http.reactive;

import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.error.HttpExceptionFactory;

import org.reactivestreams.Publisher;

import reactor.core.publisher.Mono;

/**
 * Default implementation of an {@link io.vrap.rmf.base.client.http.ErrorMiddleware} to create exceptions based on the HTTP status code
 */
class ErrorMiddlewareImpl implements ErrorMiddleware {
    private final HttpExceptionFactory exceptionFactory;

    public ErrorMiddlewareImpl(HttpExceptionFactory exceptionFactory) {
        this.exceptionFactory = exceptionFactory;
    }

    @Override
    public Publisher<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, Publisher<ApiHttpResponse<byte[]>>> next) {
        return Mono.from(next.apply(request)).map(response -> {
            if (response.getStatusCode() >= 400) {
                throw exceptionFactory.create(request, response);
            }
            return response;
        });
    }

}
