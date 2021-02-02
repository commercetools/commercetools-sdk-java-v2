
package io.vrap.rmf.base.client.http;

import static java.util.Collections.singletonList;

import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.FailsafeExecutor;
import net.jodah.failsafe.RetryPolicy;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ClientFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RetryMiddleware implements Middleware, AutoCloseable {
    @Deprecated
    public static final int DEFAULT_MAX_PARALLEL_REQUESTS = 2;

    public static final int DEFAULT_MAX_DELAY = 60000;
    public static final int DEFAULT_INITIAL_DELAY = 200;
    public static final List<Integer> DEFAULT_RETRY_STATUS_CODES = singletonList(503);
    private static final Logger logger = LoggerFactory.getLogger(ClientFactory.COMMERCETOOLS);

    private final FailsafeExecutor<ApiHttpResponse<byte[]>> failsafeExecutor;

    public RetryMiddleware(final int maxRetries) {
        this(maxRetries, DEFAULT_RETRY_STATUS_CODES);
    }

    public RetryMiddleware(final int maxRetries, List<Integer> statusCodes) {
        this(maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes);
    }

    public RetryMiddleware(final int maxRetries, final long delay, final long maxDelay) {
        this(maxRetries, delay, maxDelay, DEFAULT_RETRY_STATUS_CODES);
    }

    public RetryMiddleware(final int maxRetries, final long delay, final long maxDelay, List<Integer> statusCodes) {
        RetryPolicy<ApiHttpResponse<byte[]>> retryPolicy = new RetryPolicy<ApiHttpResponse<byte[]>>().handleIf(
            (response, throwable) -> {
                if (throwable instanceof ApiHttpException) {
                    return statusCodes.contains(((ApiHttpException) throwable).getStatusCode());
                }
                return statusCodes.contains(response.getStatusCode());
            }).withBackoff(delay, maxDelay, ChronoUnit.MILLIS).withJitter(0.25).onRetry(
                event -> logger.info("Retry #" + event.getAttemptCount())).withMaxRetries(maxRetries);
        this.failsafeExecutor = Failsafe.with(retryPolicy);
    }

    /**
     * @deprecated max parallel requests are limited by underlying HTTP client
     */
    @Deprecated
    public RetryMiddleware(final int maxParallelRequests, final int maxRetries) {
        this(maxRetries, DEFAULT_RETRY_STATUS_CODES);
    }

    /**
     * @deprecated max parallel requests are limited by underlying HTTP client
     */
    @Deprecated
    public RetryMiddleware(final int maxParallelRequests, final int maxRetries, List<Integer> statusCodes) {
        this(maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes);
    }

    /**
     * @deprecated max parallel requests are limited by underlying HTTP client
     */
    @Deprecated
    public RetryMiddleware(final int maxParallelRequests, final int maxRetries, final long delay, final long maxDelay) {
        this(maxRetries, delay, maxDelay, DEFAULT_RETRY_STATUS_CODES);
    }

    /**
     * @deprecated max parallel requests are limited by underlying HTTP client
     */
    @Deprecated
    public RetryMiddleware(final int maxParallelRequests, final int maxRetries, final long delay, final long maxDelay,
            List<Integer> statusCodes) {
        this(maxRetries, delay, maxDelay, statusCodes);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return failsafeExecutor.getStageAsync(() -> next.apply(request));
    }

    @Override
    public void close() {
    }
}
