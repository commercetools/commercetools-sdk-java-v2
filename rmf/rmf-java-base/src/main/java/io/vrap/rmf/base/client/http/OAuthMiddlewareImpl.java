
package io.vrap.rmf.base.client.http;

import java.time.Duration;
import java.util.concurrent.*;
import java.util.function.Function;

import dev.failsafe.*;
import dev.failsafe.event.ExecutionAttemptedEvent;
import dev.failsafe.spi.Scheduler;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.UnauthorizedException;
import io.vrap.rmf.base.client.oauth2.AuthException;
import io.vrap.rmf.base.client.oauth2.TokenSupplier;

/**
 * Default implementation for the {@link OAuthMiddleware} with automatic retry upon expired access
 */
public class OAuthMiddlewareImpl implements AutoCloseable, OAuthMiddleware {
    private final OAuthHandler authHandler;
    private static final InternalLogger logger = InternalLogger.getLogger(TokenSupplier.LOGGER_AUTH);
    private final FailsafeExecutor<ApiHttpResponse<byte[]>> failsafeExecutor;

    public OAuthMiddlewareImpl(final OAuthHandler oAuthHandler) {
        this(Scheduler.DEFAULT, oAuthHandler, 1, false);
    }

    public OAuthMiddlewareImpl(final OAuthHandler oauthHandler, final int maxRetries, final boolean useCircuitBreaker) {
        this(Scheduler.DEFAULT, oauthHandler, maxRetries, useCircuitBreaker);
    }

    public OAuthMiddlewareImpl(final ScheduledExecutorService executorService, final OAuthHandler oauthHandler,
            final int maxRetries, final boolean useCircuitBreaker) {
        this(Scheduler.of(executorService), oauthHandler, maxRetries, useCircuitBreaker);
    }

    public OAuthMiddlewareImpl(final ExecutorService executor, final OAuthHandler oauthHandler, final int maxRetries,
            final boolean useCircuitBreaker) {
        this(Scheduler.of(executor), oauthHandler, maxRetries, useCircuitBreaker);
    }

    public OAuthMiddlewareImpl(final Scheduler scheduler, final OAuthHandler oauthHandler, final int maxRetries,
            final boolean useCircuitBreaker) {
        this.authHandler = oauthHandler;

        RetryPolicy<ApiHttpResponse<byte[]>> retry = RetryPolicy.<ApiHttpResponse<byte[]>> builder()
                .handleIf((response, throwable) -> {
                    if (throwable != null) {
                        return throwable instanceof UnauthorizedException;
                    }
                    return response.getStatusCode() == 401;
                })
                .onRetry(event -> {
                    logger.debug(() -> "Refresh Bearer token #" + event.getAttemptCount());
                    authHandler.refreshToken();
                })
                .withMaxRetries(maxRetries)
                .build();
        if (useCircuitBreaker) {
            final Fallback<ApiHttpResponse<byte[]>> fallback = Fallback
                    .builderOfException((ExecutionAttemptedEvent<? extends ApiHttpResponse<byte[]>> event) -> {
                        logger.debug(() -> "Convert CircuitBreakerOpenException to AuthException");
                        logger.trace(event::getLastFailure);
                        return new AuthException(400, "", null, "Authentication failed", null, event.getLastFailure());
                    })
                    .handleIf(throwable -> throwable instanceof CircuitBreakerOpenException)
                    .build();

            final CircuitBreaker<ApiHttpResponse<byte[]>> circuitBreaker = CircuitBreaker
                    .<ApiHttpResponse<byte[]>> builder()
                    .handleIf((response, throwable) -> {
                        Throwable cause = throwable instanceof CompletionException ? throwable.getCause() : throwable;
                        if (cause instanceof AuthException) {
                            return ((AuthException) throwable.getCause()).getResponse().getStatusCode() == 400;
                        }
                        return response.getStatusCode() == 400;
                    })
                    .withDelayFn(context -> Duration
                            .ofMillis(Math.min(100 * context.getAttemptCount() * context.getAttemptCount(), 15000)))
                    .withFailureThreshold(5, Duration.ofMinutes(1))
                    .withSuccessThreshold(2)
                    .onClose(event -> logger.debug(() -> "The authentication circuit breaker was closed"))
                    .onOpen(event -> logger.debug(() -> "The authentication circuit breaker was opened"))
                    .onHalfOpen(event -> logger.debug(() -> "The authentication circuit breaker was half-opened"))
                    .onFailure(event -> logger.trace(() -> "Authentication failed", event.getFailure()))
                    .build();
            this.failsafeExecutor = Failsafe.with(fallback, retry, circuitBreaker).with(scheduler);
        }
        else {
            this.failsafeExecutor = Failsafe.with(retry).with(scheduler);
        }
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return failsafeExecutor.getStageAsync(() -> {
            if (request.getHeaders().getFirst(ApiHttpHeaders.AUTHORIZATION) != null) {
                return next.apply(request);
            }
            AuthenticationToken token = authHandler.getToken();
            return next.apply(request.addHeader(ApiHttpHeaders.AUTHORIZATION, OAuthHandler.authHeader(token)));
        });
    }

    @Override
    public void close() {
        authHandler.close();
    }
}
