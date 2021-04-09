
package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ResponseSerializer;

public interface ErrorMiddleware extends Middleware {

    static ErrorMiddleware of() {
        return of(ResponseSerializer.of());
    }

    static ErrorMiddleware of(final ResponseSerializer serializer) {
        return new ErrorMiddlewareImpl(serializer);
    }
}
