
package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ResponseSerializer;
import io.vrap.rmf.base.client.error.HttpExceptionFactory;

/**
 * Used to convert API errors to Exceptions
 */
public interface ErrorMiddleware extends Middleware {

    static ErrorMiddleware of() {
        return of(HttpExceptionFactory.of(ResponseSerializer.of()));
    }

    @Deprecated
    static ErrorMiddleware of(final ResponseSerializer serializer) {
        return new ErrorMiddlewareImpl(HttpExceptionFactory.of(serializer));
    }

    static ErrorMiddleware of(final HttpExceptionFactory exceptionFactory) {
        return new ErrorMiddlewareImpl(exceptionFactory);
    }
}
