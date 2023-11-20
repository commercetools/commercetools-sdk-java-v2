
package io.vrap.rmf.base.client.http;

import static io.vrap.rmf.base.client.http.HttpStatusCode.INTERNAL_SERVER_ERROR_500;
import static io.vrap.rmf.base.client.http.HttpStatusCode.SERVICE_UNAVAILABLE_503;
import static java.util.Arrays.asList;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.json.JsonException;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.failsafe.*;
import dev.failsafe.event.ExecutionAttemptedEvent;
import dev.failsafe.spi.Scheduler;

/**
 * <p>The PolicyBuilder allows the combination of different policies for failing requests.</p>
 *
 * <p>The order of policies matters. For example applying a {@link #withTimeout(Duration) timeout} before
 * {@link #withRetry(int) retry} will time out across all requests whereas applying a timeout after the retry count
 * against every single request even the retried ones.</p>
 *
 * <h3 id="retry">Retry</h3>
 *
 * <h4>Retrying on HTTP status codes</h4>
 *
 * {@include.example io.vrap.rmf.base.client.http.PolicyMiddlewareTest#retryConfigurationStatusCodes()}
 *
 * <h3>Retrying specific exceptions</h3>
 *
 * {@include.example io.vrap.rmf.base.client.http.PolicyMiddlewareTest#retryConfigurationExceptions()}
 *
 * <h3 id="timeout">Timeout</h3>
 *
 * {@include.example io.vrap.rmf.base.client.http.PolicyMiddlewareTest#timeoutConfiguration()}
 *
 * <h3 id="bulkhead">Bulkhead</h3>
 *
 * <p>Implementation of a Queue to limit the number of concurrent requests handled by the client</p>
 *
 * {@include.example io.vrap.rmf.base.client.PolicyMiddleware#queueConfiguration()}
 */
public class PolicyBuilder {

    static final String loggerName = ClientBuilder.COMMERCETOOLS + ".retry";

    int DEFAULT_MAX_DELAY = 60000;
    int DEFAULT_INITIAL_DELAY = 200;
    List<Integer> DEFAULT_RETRY_STATUS_CODES = asList(INTERNAL_SERVER_ERROR_500, SERVICE_UNAVAILABLE_503);

    private static final InternalLogger logger = InternalLogger.getLogger(loggerName);
    private static final Logger classLogger = LoggerFactory.getLogger(PolicyMiddleware.class);

    private final List<Policy<ApiHttpResponse<byte[]>>> policies;

    private final Scheduler scheduler;

    public PolicyBuilder() {
        this.policies = new ArrayList<>();
        this.scheduler = Scheduler.DEFAULT;
    }

    public PolicyBuilder(List<Policy<ApiHttpResponse<byte[]>>> policies) {
        this.policies = policies;
        this.scheduler = Scheduler.DEFAULT;
    }

    public PolicyBuilder(Scheduler scheduler, List<Policy<ApiHttpResponse<byte[]>>> policies) {
        this.policies = policies;
        this.scheduler = scheduler;
    }

    public PolicyBuilder withScheduler(ScheduledExecutorService scheduler) {
        return new PolicyBuilder(Scheduler.of(scheduler), policies);
    }

    public PolicyBuilder withScheduler(ExecutorService scheduler) {
        return new PolicyBuilder(Scheduler.of(scheduler), policies);
    }

    public PolicyBuilder withScheduler(Scheduler scheduler) {
        return new PolicyBuilder(scheduler, policies);
    }

    public PolicyBuilder withRetry(final int maxRetries) {
        return withRetry(maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, DEFAULT_RETRY_STATUS_CODES, null);
    }

    public PolicyBuilder withRetry(final int maxRetries, final List<Integer> statusCodes) {
        return withRetry(maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes, null);
    }

    public PolicyBuilder withRetry(final int maxRetries, final List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        return withRetry(maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes, failures);
    }

    public PolicyBuilder withRetry(final int maxRetries, final long delay, final long maxDelay) {
        return withRetry(maxRetries, delay, maxDelay, DEFAULT_RETRY_STATUS_CODES, null);
    }

    public PolicyBuilder withRetry(final int maxRetries, final long delay, final long maxDelay,
            final List<Integer> statusCodes) {
        return withRetry(maxRetries, delay, maxDelay, statusCodes, null);
    }

    public PolicyBuilder withRetry(final int maxRetries, final long delay, final long maxDelay,
            final List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        return withPolicy(
            retry(maxRetries, delay, maxDelay, handleFailures(failures).andThen(handleStatusCodes(statusCodes))));
    }

    public PolicyBuilder withRetry(final int maxRetries, final long delay, final long maxDelay,
            final List<Integer> statusCodes, final List<Class<? extends Throwable>> failures,
            final FailsafeRetryPolicyBuilderOptions fn) {
        return withPolicy(retry(maxRetries, delay, maxDelay,
            handleFailures(failures).andThen(handleStatusCodes(statusCodes).andThen(fn))));
    }

    public PolicyBuilder withRetry(final int maxRetries, final long delay, final long maxDelay,
            final FailsafeRetryPolicyBuilderOptions fn) {
        return withPolicy(retry(maxRetries, delay, maxDelay, fn));
    }

    public PolicyBuilder withBulkhead(final int maxConcurrency) {
        return withPolicy(bulkhead(maxConcurrency));
    }

    public PolicyBuilder withBulkhead(final int maxConcurrency, final Duration maxWaitTime) {
        return withPolicy(bulkhead(maxConcurrency, maxWaitTime));
    }

    public PolicyBuilder withBulkhead(final int maxConcurrency, final FailsafeConcurrencyBuilderOptions fn) {
        return withPolicy(bulkhead(maxConcurrency, fn));
    }

    public PolicyBuilder withBulkhead(final int maxConcurrency, final Duration maxWaitTime,
            final FailsafeConcurrencyBuilderOptions fn) {
        return withPolicy(bulkhead(maxConcurrency, maxWaitTime, fn));
    }

    public PolicyBuilder withTimeout(final Duration duration) {
        return withPolicy(timeout(duration));
    }

    public PolicyBuilder withTimeout(final Duration duration, final FailsafeTimeoutBuilderOptions fn) {
        return withPolicy(timeout(duration, fn));
    }

    public PolicyBuilder withPolicy(Policy<ApiHttpResponse<byte[]>> policy) {
        List<Policy<ApiHttpResponse<byte[]>>> copy = new ArrayList<>(policies);
        copy.add(policy);
        return new PolicyBuilder(copy);
    }

    public PolicyMiddleware build() {
        return PolicyMiddleware.of(scheduler, policies);
    }

    public static PolicyBuilder of() {
        return new PolicyBuilder();
    }

    public static RetryPolicy<ApiHttpResponse<byte[]>> retry(final int maxRetries, final long delay,
            final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return fn
                .apply(RetryPolicy.<ApiHttpResponse<byte[]>> builder()
                        .withBackoff(delay, maxDelay, ChronoUnit.MILLIS)
                        .withJitter(0.25)
                        .withMaxRetries(maxRetries)
                        .onRetry(PolicyBuilder::logEventFailure))
                .build();
    }

    public static Timeout<ApiHttpResponse<byte[]>> timeout(final Duration duration) {
        return timeout(duration, options -> options);
    }

    public static Timeout<ApiHttpResponse<byte[]>> timeout(final Duration duration,
            final FailsafeTimeoutBuilderOptions fn) {
        return fn.apply(Timeout.builder(duration)).build();
    }

    public static Bulkhead<ApiHttpResponse<byte[]>> bulkhead(final int maxConcurrency) {
        return bulkhead(maxConcurrency, options -> options);
    }

    public static Bulkhead<ApiHttpResponse<byte[]>> bulkhead(final int maxConcurrency, final Duration maxWaitTime) {
        return bulkhead(maxConcurrency, maxWaitTime, options -> options);
    }

    public static Bulkhead<ApiHttpResponse<byte[]>> bulkhead(final int maxConcurrency,
            final FailsafeConcurrencyBuilderOptions fn) {
        return fn.apply(Bulkhead.builder(maxConcurrency)).build();
    }

    public static Bulkhead<ApiHttpResponse<byte[]>> bulkhead(final int maxConcurrency, final Duration maxWaitTime,
            final FailsafeConcurrencyBuilderOptions fn) {
        return fn.apply(Bulkhead.<ApiHttpResponse<byte[]>> builder(maxConcurrency).withMaxWaitTime(maxWaitTime))
                .build();
    }

    public static FailsafeRetryPolicyBuilderOptions handleFailures(final List<Class<? extends Throwable>> failures) {
        return builder -> {
            if (failures != null) {
                builder.handle(failures);
            }
            return builder;
        };
    }

    public static FailsafeRetryPolicyBuilderOptions handleStatusCodes(final List<Integer> statusCodes) {
        return builder -> builder.handleIf((response, throwable) -> {
            if (throwable instanceof ApiHttpException) {
                return statusCodes.contains(((ApiHttpException) throwable).getStatusCode());
            }
            return statusCodes.contains(response.getStatusCode());
        });
    }

    private static void logEventFailure(ExecutionAttemptedEvent<ApiHttpResponse<byte[]>> event) {
        final int attempt = event.getAttemptCount();

        logger.info(() -> "Retry #" + attempt);
        logger.trace(() -> {
            final Throwable failure = event.getLastException();
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

    private static String requestLog(final int attempt, ApiHttpRequest request, ApiHttpResponse<?> response) {
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
}
