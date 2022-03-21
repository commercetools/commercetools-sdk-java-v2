
package com.commercetools.api.client;

import io.vrap.rmf.base.client.http.Middleware;

public interface ConcurrentModificationMiddleware extends Middleware {
    public static ConcurrentModificationMiddleware of() {
        return new ConcurrentModificationMiddlewareImpl();
    }

    public static ConcurrentModificationMiddleware of(final int maxRetries) {
        return new ConcurrentModificationMiddlewareImpl(maxRetries);
    }

    public static ConcurrentModificationMiddleware of(final int maxRetries, final long delay, final long maxDelay) {
        return new ConcurrentModificationMiddlewareImpl(maxRetries, delay, maxDelay);
    }
}
