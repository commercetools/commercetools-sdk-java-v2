
package io.vrap.rmf.base.client.http;

import static io.vrap.rmf.base.client.http.HttpStatusCode.INTERNAL_SERVER_ERROR_500;
import static io.vrap.rmf.base.client.http.HttpStatusCode.SERVICE_UNAVAILABLE_503;
import static java.util.Arrays.asList;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.json.JsonException;
import io.vrap.rmf.base.client.utils.json.JsonUtils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.failsafe.Bulkhead;
import dev.failsafe.RetryPolicy;
import dev.failsafe.Timeout;
import dev.failsafe.event.ExecutionAttemptedEvent;

public class RetryPolicyBuilder {

    static final String loggerName = ClientBuilder.COMMERCETOOLS + ".retry";

    int DEFAULT_MAX_DELAY = 60000;
    int DEFAULT_INITIAL_DELAY = 200;

    int DEFAULT_RETRIES = 3;

    List<Integer> DEFAULT_RETRY_STATUS_CODES = asList(INTERNAL_SERVER_ERROR_500, SERVICE_UNAVAILABLE_503);

    private static final InternalLogger logger = InternalLogger.getLogger(loggerName);
    private static final Logger classLogger = LoggerFactory.getLogger(PolicyMiddleware.class);

    private final int maxRetries;
    private final long initialDelay;
    private final long maxDelay;
    private final List<Integer> statusCodes;
    private final List<Class<? extends Throwable>> failures;

    private final FailsafeRetryPolicyBuilderOptions fn;

    public RetryPolicyBuilder() {
        this.maxRetries = DEFAULT_RETRIES;
        this.initialDelay = DEFAULT_INITIAL_DELAY;
        this.maxDelay = DEFAULT_MAX_DELAY;
        this.statusCodes = DEFAULT_RETRY_STATUS_CODES;
        this.failures = null;
        this.fn = options -> options;
    }

    public RetryPolicyBuilder(int maxRetries, long initialDelay, long maxDelay, List<Integer> statusCodes,
            List<Class<? extends Throwable>> failures, FailsafeRetryPolicyBuilderOptions fn) {
        this.maxRetries = maxRetries;
        this.initialDelay = initialDelay;
        this.maxDelay = maxDelay;
        this.statusCodes = statusCodes;
        this.failures = failures;
        this.fn = fn;
    }

    public RetryPolicyBuilder maxRetries(final int maxRetries) {
        return new RetryPolicyBuilder(maxRetries, initialDelay, maxDelay, statusCodes, failures, fn);
    }

    public RetryPolicyBuilder initialDelay(final long initialDelay) {
        return new RetryPolicyBuilder(maxRetries, initialDelay, maxDelay, statusCodes, failures, fn);
    }

    public RetryPolicyBuilder maxDelay(final long maxDelay) {
        return new RetryPolicyBuilder(maxRetries, initialDelay, maxDelay, statusCodes, failures, fn);
    }

    public RetryPolicyBuilder statusCodes(final List<Integer> statusCodes) {
        return new RetryPolicyBuilder(maxRetries, initialDelay, maxDelay, statusCodes, failures, fn);
    }

    public RetryPolicyBuilder failures(final List<Class<? extends Throwable>> failures) {
        return new RetryPolicyBuilder(maxRetries, initialDelay, maxDelay, statusCodes, failures, fn);
    }

    public RetryPolicyBuilder options(final FailsafeRetryPolicyBuilderOptions options) {
        return new RetryPolicyBuilder(maxRetries, initialDelay, maxDelay, statusCodes, failures, options);
    }

    public RetryPolicy<ApiHttpResponse<byte[]>> build() {
        return retry(maxRetries, initialDelay, maxDelay,
            handleStatusCodes(statusCodes).andThen(handleFailures(failures).andThen(fn)));
    }

    public static RetryPolicyBuilder of() {
        return new RetryPolicyBuilder();
    }

    public static RetryPolicy<ApiHttpResponse<byte[]>> retry(final int maxRetries, final long delay,
            final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return fn
                .apply(RetryPolicy.<ApiHttpResponse<byte[]>> builder()
                        .withBackoff(delay, maxDelay, ChronoUnit.MILLIS)
                        .withJitter(0.25)
                        .withMaxRetries(maxRetries)
                        .onRetry(RetryPolicyBuilder::logEventFailure))
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
