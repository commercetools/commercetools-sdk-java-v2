
package io.vrap.rmf.base.client.http;

import static io.vrap.rmf.base.client.http.HttpStatusCode.INTERNAL_SERVER_ERROR_500;
import static io.vrap.rmf.base.client.http.HttpStatusCode.SERVICE_UNAVAILABLE_503;
import static java.util.Arrays.asList;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

import io.vrap.rmf.base.client.ApiHttpException;

import dev.failsafe.spi.Scheduler;

/**
 * <h2>Retry failed requests</h2>
 *
 * <p>Middleware for retrying of a requests upon configured response status codes and/or exceptions</p>
 *
 * <h3>Retrying on HTTP status codes</h3>
 *
 * <p><pre><code class='java'>{@code
 *    ApiRootBuilder.of()
 *      ...
 *      .withRetryMiddleware(3, Arrays.asList(HttpStatusCode.SERVICE_UNAVAILABLE_503, HttpStatusCode.INTERNAL_SERVER_ERROR_500))
 *  }</code></pre>
 *  </p>
 *
 * <h3>Retrying specific exceptions</h3>
 *
 * <p><pre><code class='java'>{@code
 *    ApiRootBuilder.of()
 *      ...
 *      .addMiddleware(RetryRequestMiddleware.of(3, emptyList(), singletonList(JsonException.class)))
 *  }</code></pre>
 *  </p>
 * @deprecated use {@link PolicyMiddleware} instead
 */
@Deprecated
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

    public static RetryRequestMiddleware of(final Scheduler scheduler, final int maxRetries) {
        return new RetryMiddleware(scheduler, maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY,
            DEFAULT_RETRY_STATUS_CODES, null);
    }

    public static RetryRequestMiddleware of(final Scheduler scheduler, final int maxRetries,
            final List<Integer> statusCodes) {
        return new RetryMiddleware(scheduler, maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes, null);
    }

    public static RetryRequestMiddleware of(final Scheduler scheduler, final int maxRetries,
            final List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        return new RetryMiddleware(scheduler, maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes,
            failures);
    }

    public static RetryRequestMiddleware of(final Scheduler scheduler, final int maxRetries, final long delay,
            final long maxDelay) {
        return new RetryMiddleware(scheduler, maxRetries, delay, maxDelay, DEFAULT_RETRY_STATUS_CODES, null);
    }

    public static RetryRequestMiddleware of(final Scheduler scheduler, final int maxRetries, final long delay,
            final long maxDelay, final List<Integer> statusCodes) {
        return new RetryMiddleware(scheduler, maxRetries, delay, maxDelay, statusCodes, null);
    }

    public static RetryRequestMiddleware of(final Scheduler scheduler, final int maxRetries, final long delay,
            final long maxDelay, final List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        return new RetryMiddleware(scheduler, maxRetries, delay, maxDelay,
            handleFailures(failures).andThen(handleStatusCodes(statusCodes)));
    }

    public static RetryRequestMiddleware of(final Scheduler scheduler, final int maxRetries, final long delay,
            final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return new RetryMiddleware(scheduler, maxRetries, delay, maxDelay, fn);
    }

    public static RetryRequestMiddleware of(final ScheduledExecutorService executorService, final int maxRetries) {
        return new RetryMiddleware(executorService, maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY,
            DEFAULT_RETRY_STATUS_CODES, null);
    }

    public static RetryRequestMiddleware of(final ScheduledExecutorService executorService, final int maxRetries,
            final List<Integer> statusCodes) {
        return new RetryMiddleware(executorService, maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes,
            null);
    }

    public static RetryRequestMiddleware of(final ScheduledExecutorService executorService, final int maxRetries,
            final List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        return new RetryMiddleware(executorService, maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes,
            failures);
    }

    public static RetryRequestMiddleware of(final ScheduledExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay) {
        return new RetryMiddleware(executorService, maxRetries, delay, maxDelay, DEFAULT_RETRY_STATUS_CODES, null);
    }

    public static RetryRequestMiddleware of(final ScheduledExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, final List<Integer> statusCodes) {
        return new RetryMiddleware(executorService, maxRetries, delay, maxDelay, statusCodes, null);
    }

    public static RetryRequestMiddleware of(final ScheduledExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, final List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        return new RetryMiddleware(executorService, maxRetries, delay, maxDelay,
            handleFailures(failures).andThen(handleStatusCodes(statusCodes)));
    }

    public static RetryRequestMiddleware of(final ScheduledExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return new RetryMiddleware(executorService, maxRetries, delay, maxDelay, fn);
    }

    public static RetryRequestMiddleware of(final ExecutorService executorService, final int maxRetries) {
        return new RetryMiddleware(executorService, maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY,
            DEFAULT_RETRY_STATUS_CODES, null);
    }

    public static RetryRequestMiddleware of(final ExecutorService executorService, final int maxRetries,
            final List<Integer> statusCodes) {
        return new RetryMiddleware(executorService, maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes,
            null);
    }

    public static RetryRequestMiddleware of(final ExecutorService executorService, final int maxRetries,
            final List<Integer> statusCodes, final List<Class<? extends Throwable>> failures) {
        return new RetryMiddleware(executorService, maxRetries, DEFAULT_INITIAL_DELAY, DEFAULT_MAX_DELAY, statusCodes,
            failures);
    }

    public static RetryRequestMiddleware of(final ExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay) {
        return new RetryMiddleware(executorService, maxRetries, delay, maxDelay, DEFAULT_RETRY_STATUS_CODES, null);
    }

    public static RetryRequestMiddleware of(final ExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, final List<Integer> statusCodes) {
        return new RetryMiddleware(executorService, maxRetries, delay, maxDelay, statusCodes, null);
    }

    public static RetryRequestMiddleware of(final ExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, final List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        return new RetryMiddleware(executorService, maxRetries, delay, maxDelay,
            handleFailures(failures).andThen(handleStatusCodes(statusCodes)));
    }

    public static RetryRequestMiddleware of(final ExecutorService executorService, final int maxRetries,
            final long delay, final long maxDelay, final FailsafeRetryPolicyBuilderOptions fn) {
        return new RetryMiddleware(executorService, maxRetries, delay, maxDelay, fn);
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
