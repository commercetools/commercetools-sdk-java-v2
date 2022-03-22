
package io.vrap.rmf.base.client.http;

import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import dev.failsafe.Failsafe;
import dev.failsafe.FailsafeExecutor;
import dev.failsafe.RetryPolicy;
import dev.failsafe.event.ExecutionAttemptedEvent;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.json.JsonException;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Implementation for a retry of a requests upon configured response status codes
 */
public class RetryMiddleware implements RetryRequestMiddleware, AutoCloseable {
    static final String loggerName = ClientBuilder.COMMERCETOOLS + ".retry";

    /**
     * @deprecated use {@link RetryRequestMiddleware#DEFAULT_MAX_DELAY} instead
     */
    @Deprecated
    public static final int DEFAULT_MAX_DELAY = RetryRequestMiddleware.DEFAULT_MAX_DELAY;
    /**
     * @deprecated use {@link RetryRequestMiddleware#DEFAULT_INITIAL_DELAY} instead
     */
    @Deprecated
    public static final int DEFAULT_INITIAL_DELAY = RetryRequestMiddleware.DEFAULT_INITIAL_DELAY;
    /**
     * @deprecated use {@link RetryRequestMiddleware#DEFAULT_RETRY_STATUS_CODES} instead
     */
    @Deprecated
    public static final List<Integer> DEFAULT_RETRY_STATUS_CODES = RetryRequestMiddleware.DEFAULT_RETRY_STATUS_CODES;
    private static final InternalLogger logger = InternalLogger.getLogger(loggerName);
    private static final Logger classLogger = LoggerFactory.getLogger(RetryMiddleware.class);

    private final FailsafeExecutor<ApiHttpResponse<byte[]>> failsafeExecutor;

    /**
     * @deprecated use {@link RetryRequestMiddleware#of(int)} instead
     */
    @Deprecated
    public RetryMiddleware(final int maxRetries) {
        this(maxRetries, RetryRequestMiddleware.DEFAULT_INITIAL_DELAY, RetryRequestMiddleware.DEFAULT_MAX_DELAY,
            RetryRequestMiddleware.DEFAULT_RETRY_STATUS_CODES, null);
    }

    /**
     * @deprecated use {@link RetryRequestMiddleware#of(int, List)} instead
     */
    @Deprecated
    public RetryMiddleware(final int maxRetries, final List<Integer> statusCodes) {
        this(maxRetries, RetryRequestMiddleware.DEFAULT_INITIAL_DELAY, RetryRequestMiddleware.DEFAULT_MAX_DELAY,
            statusCodes, null);
    }

    RetryMiddleware(final int maxRetries, final List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        this(maxRetries, RetryRequestMiddleware.DEFAULT_INITIAL_DELAY, RetryRequestMiddleware.DEFAULT_MAX_DELAY,
            statusCodes, failures);
    }

    /**
     * @deprecated use {@link RetryRequestMiddleware#of(int, long, long)} instead
     */
    @Deprecated
    public RetryMiddleware(final int maxRetries, final long delay, final long maxDelay) {
        this(maxRetries, delay, maxDelay, RetryRequestMiddleware.DEFAULT_RETRY_STATUS_CODES, null);
    }

    /**
     * @deprecated use {@link RetryRequestMiddleware#of(int, long, long, List)} instead
     */
    @Deprecated
    public RetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            final List<Integer> statusCodes) {
        this(maxRetries, delay, maxDelay, statusCodes, null);
    }

    RetryMiddleware(final int maxRetries, final long delay, final long maxDelay, final List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        this(maxRetries, delay, maxDelay, RetryRequestMiddleware.handleFailures(failures)
                .andThen(RetryRequestMiddleware.handleStatusCodes(statusCodes)));
    }

    RetryMiddleware(final int maxRetries, final long delay, final long maxDelay,
            final FailsafeRetryPolicyBuilderOptions fn) {
        RetryPolicy<ApiHttpResponse<byte[]>> retryPolicy = fn
                .apply(RetryPolicy.<ApiHttpResponse<byte[]>> builder()
                        .withBackoff(delay, maxDelay, ChronoUnit.MILLIS)
                        .withJitter(0.25)
                        .withMaxRetries(maxRetries)
                        .onRetry(this::logEventFailure))
                .build();
        this.failsafeExecutor = Failsafe.with(retryPolicy);
    }

    private void logEventFailure(ExecutionAttemptedEvent<ApiHttpResponse<byte[]>> event) {
        final int attempt = event.getAttemptCount();

        logger.info(() -> "Retry #" + attempt);
        logger.trace(() -> {
            final Throwable failure = event.getLastFailure();
            if (failure instanceof ApiHttpException) {
                final ApiHttpException httpException = (ApiHttpException) failure;
                final ApiHttpRequest request = httpException.getRequest();
                final ApiHttpResponse<byte[]> response = httpException.getResponse();
                if (request != null) {
                    return requestLog(attempt, request, response);
                }
            }
            return event.toString();
        });
    }

    private String requestLog(final int attempt, ApiHttpRequest request, ApiHttpResponse<?> response) {
        String output;
        final String httpMethodAndUrl = request.getMethod().name() + " " + request.getUrl().toString();
        if (request.getBody() != null) {
            final String unformattedBody = request.getSecuredBody();
            final boolean isJsonRequest = request.getHeaders()
                    .getHeaders(ApiHttpHeaders.CONTENT_TYPE)
                    .stream()
                    .findFirst()
                    .map(ct -> ct.getValue().toLowerCase().contains("json"))
                    .orElse(true);
            if (isJsonRequest) {
                String prettyPrint;
                try {
                    prettyPrint = JsonUtils.prettyPrint(unformattedBody);
                }
                catch (final JsonException e) {
                    classLogger.warn("pretty print failed", e);
                    prettyPrint = unformattedBody;
                }
                output = "Retry #" + attempt + ": " + request + "\n" + httpMethodAndUrl + "\nformatted: " + prettyPrint;
            }
            else {
                output = "Retry #" + attempt + ": " + request + "\n" + request.getMethod().name() + " "
                        + request.getUrl() + " " + unformattedBody;
            }
        }
        else {
            output = "Retry #" + attempt + ": " + request + "\n" + httpMethodAndUrl + " <no body>";
        }
        if (response != null) {
            output += "\nFailure response: " + response.getStatusCode() + "\n" + response + "\n"
                    + Optional.ofNullable(response.getBody())
                            .map(body -> JsonUtils.prettyPrint(response.getBodyAsString().orElse("")))
                            .orElse("<no body>");
        }
        return output;
    }

    /**
     * @deprecated max parallel requests are limited by underlying HTTP client
     */
    @Deprecated
    public RetryMiddleware(final int maxParallelRequests, final int maxRetries) {
        this(maxRetries, RetryRequestMiddleware.DEFAULT_INITIAL_DELAY, RetryRequestMiddleware.DEFAULT_MAX_DELAY,
            RetryRequestMiddleware.DEFAULT_RETRY_STATUS_CODES, null);
    }

    /**
     * @deprecated max parallel requests are limited by underlying HTTP client
     */
    @Deprecated
    public RetryMiddleware(final int maxParallelRequests, final int maxRetries, final List<Integer> statusCodes) {
        this(maxRetries, RetryRequestMiddleware.DEFAULT_INITIAL_DELAY, RetryRequestMiddleware.DEFAULT_MAX_DELAY,
            statusCodes, null);
    }

    /**
     * @deprecated max parallel requests are limited by underlying HTTP client
     */
    @Deprecated
    public RetryMiddleware(final int maxParallelRequests, final int maxRetries, final long delay, final long maxDelay) {
        this(maxRetries, delay, maxDelay, RetryRequestMiddleware.DEFAULT_RETRY_STATUS_CODES, null);
    }

    /**
     * @deprecated max parallel requests are limited by underlying HTTP client
     */
    @Deprecated
    public RetryMiddleware(final int maxParallelRequests, final int maxRetries, final long delay, final long maxDelay,
            List<Integer> statusCodes) {
        this(maxRetries, delay, maxDelay, statusCodes, null);
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
