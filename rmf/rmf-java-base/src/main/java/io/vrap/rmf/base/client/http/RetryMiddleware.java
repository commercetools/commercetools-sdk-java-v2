package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpException;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.ClientFactory;
import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.FailsafeExecutor;
import net.jodah.failsafe.RetryPolicy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;

import static java.util.Collections.singletonList;

public class RetryMiddleware implements Middleware, AutoCloseable {
    Logger logger = LoggerFactory.getLogger(ClientFactory.COMMERCETOOLS);

    private final FailsafeExecutor<ApiHttpResponse<byte[]>> failsafeExecutor;

    public RetryMiddleware(final int maxRetries) {
        this(maxRetries, singletonList(503));
    }

    public RetryMiddleware(final int maxRetries, List<Integer> statusCodes) {
        this(maxRetries, 100, 1000, statusCodes);
    }

    public RetryMiddleware(final int maxRetries, final long delay, final long maxDelay) {
        this(maxRetries, delay, maxDelay, singletonList(503));
    }

    public RetryMiddleware(final int maxRetries, final long delay, final long maxDelay, List<Integer> statusCodes) {
        RetryPolicy<ApiHttpResponse<byte[]>> retryPolicy = new RetryPolicy<ApiHttpResponse<byte[]>>()
                .handleIf((response, throwable) -> {
                    if (throwable instanceof ApiHttpException) {
                       return statusCodes.contains(((ApiHttpException)throwable).getStatusCode());
                    }
                    return statusCodes.contains(response.getStatusCode());
                })
                .withBackoff(delay, maxDelay, ChronoUnit.MILLIS)
                .onRetry(event -> logger.info("Retry #" + event.getAttemptCount()))
                .withMaxRetries(maxRetries);
        this.failsafeExecutor = Failsafe.with(retryPolicy);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request, final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return failsafeExecutor.getStageAsync(() -> next.apply(request));
    }

    @Override
    public void close() {
    }
}
