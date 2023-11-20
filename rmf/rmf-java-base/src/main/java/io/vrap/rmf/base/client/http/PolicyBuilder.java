
package io.vrap.rmf.base.client.http;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;

import io.vrap.rmf.base.client.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.failsafe.*;
import dev.failsafe.spi.Scheduler;

/**
 * <p>The PolicyBuilder allows the combination of different policies for failing requests.</p>
 *
 * <p>The order of policies matters. For example applying a {@link #withTimeout(Duration) timeout} before
 * {@link #withRetry(RetryPolicyBuilder)} retry} will time out across all requests whereas applying a timeout after the retry count
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
 * {@include.example io.vrap.rmf.base.client.http.PolicyMiddlewareTest#queueConfiguration()}
 */
public class PolicyBuilder {

    static final String loggerName = ClientBuilder.COMMERCETOOLS + ".retry";

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

    public PolicyBuilder withRetry(RetryPolicyBuilder retryPolicyBuilder) {
        return withPolicy(retryPolicyBuilder.build());
    }

    public PolicyBuilder withRetry(Function<RetryPolicyBuilder, RetryPolicyBuilder> fn) {
        return withPolicy(fn.apply(RetryPolicyBuilder.of()).build());
    }

    public PolicyBuilder withRetry(final int maxRetries) {
        return withRetry(retry -> retry.maxRetries(maxRetries));
    }

    public PolicyBuilder withRetry(final int maxRetries, final List<Integer> statusCodes) {
        return withRetry(retry -> retry.maxRetries(maxRetries).statusCodes(statusCodes));
    }

    public PolicyBuilder withRetry(final int maxRetries, final List<Integer> statusCodes,
            final List<Class<? extends Throwable>> failures) {
        return withRetry(retry -> retry.maxRetries(maxRetries).statusCodes(statusCodes).failures(failures));
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
}
