
package io.vrap.rmf.base.client.http;

public interface OAuthMiddleware extends Middleware {

    static OAuthMiddleware of(final OAuthHandler oAuthHandler) {
        return new OAuthMiddlewareImpl(oAuthHandler);
    }

    static OAuthMiddleware of(final OAuthHandler oauthHandler, final Integer maxRetries) {
        return new OAuthMiddlewareImpl(oauthHandler, maxRetries);
    }
}
