
package io.vrap.rmf.base.client.http;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.FailsafeExecutor;
import net.jodah.failsafe.RetryPolicy;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.UnauthorizedException;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OAuthMiddleware implements Middleware, AutoCloseable {
    private final OAuthHandler authHandler;
    private static final Logger logger = LoggerFactory.getLogger(TokenSupplier.LOGGER_AUTH);
    private final FailsafeExecutor<ApiHttpResponse<byte[]>> failsafeExecutor;

    public OAuthMiddleware(final OAuthHandler oAuthHandler) {
        this(oAuthHandler, 1);
    }

    public OAuthMiddleware(final OAuthHandler oauthHandler, final Integer maxRetries) {
        RetryPolicy<ApiHttpResponse<byte[]>> retry = new RetryPolicy<ApiHttpResponse<byte[]>>().handleIf(
            (response, throwable) -> {
                if (throwable != null) {
                    return throwable instanceof UnauthorizedException;
                }
                return response.getStatusCode() == 401;
            }).onRetry(event -> {
                logger.debug("Refresh Bearer token #" + event.getAttemptCount());
                oauthHandler.refreshToken();
            }).withMaxRetries(maxRetries);
        this.authHandler = oauthHandler;
        this.failsafeExecutor = Failsafe.with(retry);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return failsafeExecutor.getStageAsync(() -> {
            AuthenticationToken token = authHandler.getToken();
            return next.apply(request.addHeader(ApiHttpHeaders.AUTHORIZATION, OAuthHandler.authHeader(token)));
        });
    }

    @Override
    public void close() {
        authHandler.close();
    }
}
