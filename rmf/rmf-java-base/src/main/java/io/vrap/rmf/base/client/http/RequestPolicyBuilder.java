
package io.vrap.rmf.base.client.http;

import java.time.Duration;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Function;
import java.util.function.Predicate;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import dev.failsafe.Policy;
import dev.failsafe.spi.Scheduler;

/**
 * <h2>RequestPolicyBuilder</h2>
 *
 * <p>The RequestPolicyBuilder allows the combination of different policies for failing requests and apply them to matching
 * requests.</p>
 *
 * <p>The order of policies matters. For example applying a {@link PolicyBuilder#withTimeout(Duration) timeout} before
 * {@link PolicyBuilder#withRetry(RetryPolicyBuilder)} retry} will time out across all requests whereas applying a timeout after the retry count
 * against every single request even the retried ones.</p>
 *
 * <h3 id="retry">Retry</h3>
 *
 * <h4>Retrying on HTTP status codes</h4>
 *
 * {@include.example io.vrap.rmf.base.client.http.RequestPolicyMiddlewareTest#retryConfigurationStatusCodes()}
 *
 * <h3>Retrying specific exceptions</h3>
 *
 * {@include.example io.vrap.rmf.base.client.http.RequestPolicyMiddlewareTest#retryConfigurationExceptions()}
 *
 * <h3 id="timeout">Timeout</h3>
 *
 * {@include.example io.vrap.rmf.base.client.http.RequestPolicyMiddlewareTest#timeoutConfiguration()}
 *
 * <h3 id="bulkhead">Bulkhead</h3>
 *
 * <p>Implementation of a Queue to limit the number of concurrent requests handled by the client</p>
 *
 * {@include.example io.vrap.rmf.base.client.http.RequestPolicyMiddlewareTest#queueConfiguration()}
 */
public class RequestPolicyBuilder {

    private final Map<Predicate<ApiHttpRequest>, List<Policy<ApiHttpResponse<byte[]>>>> policies;

    private final Scheduler scheduler;

    public RequestPolicyBuilder() {
        this.policies = new LinkedHashMap<>();
        this.scheduler = Scheduler.DEFAULT;
    }

    public RequestPolicyBuilder(final Map<Predicate<ApiHttpRequest>, List<Policy<ApiHttpResponse<byte[]>>>> policies) {
        this.policies = policies;
        this.scheduler = Scheduler.DEFAULT;
    }

    public RequestPolicyBuilder(final Scheduler scheduler,
            final Map<Predicate<ApiHttpRequest>, List<Policy<ApiHttpResponse<byte[]>>>> policies) {
        this.policies = policies;
        this.scheduler = scheduler;
    }

    public RequestPolicyBuilder withScheduler(final ScheduledExecutorService scheduler) {
        return new RequestPolicyBuilder(Scheduler.of(scheduler), policies);
    }

    public RequestPolicyBuilder withScheduler(final ExecutorService scheduler) {
        return new RequestPolicyBuilder(Scheduler.of(scheduler), policies);
    }

    public RequestPolicyBuilder withScheduler(final Scheduler scheduler) {
        return new RequestPolicyBuilder(scheduler, policies);
    }

    public RequestPolicyBuilder withRequestMatching(final Predicate<ApiHttpRequest> predicate,
            Function<PolicyBuilder, PolicyBuilder> fn) {
        Map<Predicate<ApiHttpRequest>, List<Policy<ApiHttpResponse<byte[]>>>> policiesCopy = new LinkedHashMap<>(
            policies);
        policiesCopy.put(predicate, fn.apply(PolicyBuilder.of()).getPolicies());
        return new RequestPolicyBuilder(scheduler, policiesCopy);
    }

    public RequestPolicyBuilder withAllOtherRequests(Function<PolicyBuilder, PolicyBuilder> fn) {
        Map<Predicate<ApiHttpRequest>, List<Policy<ApiHttpResponse<byte[]>>>> policiesCopy = new LinkedHashMap<>(
            policies);
        policiesCopy.put(apiHttpRequest -> true, fn.apply(PolicyBuilder.of()).getPolicies());
        return new RequestPolicyBuilder(scheduler, policiesCopy);
    }

    public PolicyMiddleware build() {
        return PolicyMiddleware.of(new ArrayList<>(policies.entrySet()), scheduler);
    }

    public static RequestPolicyBuilder of() {
        return new RequestPolicyBuilder();
    }
}
