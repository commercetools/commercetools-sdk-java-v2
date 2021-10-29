
package io.vrap.rmf.base.client.http;

/**
 * Middleware to add an oauth authentication header to requests
 */
public interface OAuthMiddleware extends Middleware {

    static OAuthMiddleware of(final OAuthHandler oAuthHandler) {
        return new OAuthMiddlewareImpl(oAuthHandler);
    }

    static OAuthMiddleware of(final OAuthHandler oauthHandler, final int maxRetries) {
        return new OAuthMiddlewareImpl(oauthHandler, maxRetries, false);
    }

    static OAuthMiddleware of(final OAuthHandler oauthHandler, final int maxRetries, final boolean useCircuitBreaker) {
        return new OAuthMiddlewareImpl(oauthHandler, maxRetries, useCircuitBreaker);
    }
}
