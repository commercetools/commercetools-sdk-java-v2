
package io.vrap.rmf.base.client.http;

import static io.vrap.rmf.base.client.http.HttpStatusCode.INTERNAL_SERVER_ERROR_500;
import static io.vrap.rmf.base.client.http.HttpStatusCode.SERVICE_UNAVAILABLE_503;
import static java.util.Arrays.asList;

import java.util.List;

import io.vrap.rmf.base.client.ApiHttpException;

public interface RetryRequestMiddleware extends Middleware {
    int DEFAULT_MAX_DELAY = 60000;
    int DEFAULT_INITIAL_DELAY = 200;
    List<Integer> DEFAULT_RETRY_STATUS_CODES = asList(INTERNAL_SERVER_ERROR_500, SERVICE_UNAVAILABLE_503);

    public static RetryRequestMiddleware of(final int maxRetries) {
        return new RetryMiddleware(maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, DEFAULT_RETRY_STATUS_CODES,
            null);
    }

    public static RetryRequestMiddleware of(final int maxRetries, final List<Integer> statusCodes) {
        return new RetryMiddleware(maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes, null);
    }

    public static RetryRequestMiddleware of(final int maxRetries, final List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        return new RetryMiddleware(maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes, failures);
    }

    public static RetryRequestMiddleware of(final int maxRetries, final long delay, final long maxDelay) {
        return new RetryMiddleware(maxRetries, delay, maxDelay, DEFAULT_RETRY_STATUS_CODES, null);
    }

    public static RetryRequestMiddleware of(final int maxRetries, final long delay, final long maxDelay,
            final List<Integer> statusCodes) {
        return new RetryMiddleware(maxRetries, delay, maxDelay, statusCodes, null);
    }

    public static RetryRequestMiddleware of(final int maxRetries, final long delay, final long maxDelay,
            final List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        return new RetryMiddleware(maxRetries, delay, maxDelay,
            handleFailures(failures).andThen(handleStatusCodes(statusCodes)));
    }

    public static RetryRequestMiddleware of(final int maxRetries, final long delay, final long maxDelay,
            final FailsafeRetryPolicyBuilderOptions fn) {
        return new RetryMiddleware(maxRetries, delay, maxDelay, fn);
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
}
