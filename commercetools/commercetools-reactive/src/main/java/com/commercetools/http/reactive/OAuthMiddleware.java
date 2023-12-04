
package com.commercetools.http.reactive;

import io.vrap.rmf.base.client.http.OAuthHandler;

public interface OAuthMiddleware extends Middleware {
    public static OAuthMiddleware of(final OAuthHandler handler) {
        return new OAuthMiddlewareImpl(handler);
    }
}
