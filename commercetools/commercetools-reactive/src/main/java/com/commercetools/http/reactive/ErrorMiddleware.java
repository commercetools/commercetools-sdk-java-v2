
package com.commercetools.http.reactive;

import io.vrap.rmf.base.client.ResponseSerializer;
import io.vrap.rmf.base.client.error.HttpExceptionFactory;

/**
 * Used to convert API errors to Exceptions. Uses the {@link HttpExceptionFactory} to convert responses to Exceptions
 */
public interface ErrorMiddleware extends Middleware {

    static ErrorMiddleware of() {
        return of(HttpExceptionFactory.of(ResponseSerializer.of()));
    }

    static ErrorMiddleware of(final ResponseSerializer serializer) {
        return of(HttpExceptionFactory.of(serializer));
    }

    static ErrorMiddleware of(final HttpExceptionFactory exceptionFactory) {
        return new ErrorMiddlewareImpl(exceptionFactory);
    }
}
