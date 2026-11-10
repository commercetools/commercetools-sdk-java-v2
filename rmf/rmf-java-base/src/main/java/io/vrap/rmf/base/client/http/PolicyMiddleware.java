
package io.vrap.rmf.base.client.http;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Predicate;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import dev.failsafe.Policy;
import dev.failsafe.spi.Scheduler;

public interface PolicyMiddleware extends Middleware {
    public static PolicyMiddleware of(final List<Policy<ApiHttpResponse<byte[]>>> policies) {
        return new PolicyMiddlewareImpl(Scheduler.DEFAULT, policies);
    }

    public static PolicyMiddleware of(final Scheduler scheduler, final List<Policy<ApiHttpResponse<byte[]>>> policies) {
        return new PolicyMiddlewareImpl(scheduler, policies);
    }

    public static PolicyMiddleware of(final ScheduledExecutorService scheduler,
            final List<Policy<ApiHttpResponse<byte[]>>> policies) {
        return new PolicyMiddlewareImpl(Scheduler.of(scheduler), policies);
    }

    public static PolicyMiddleware of(final ExecutorService scheduler,
            final List<Policy<ApiHttpResponse<byte[]>>> policies) {
        return new PolicyMiddlewareImpl(Scheduler.of(scheduler), policies);
    }

    public static PolicyMiddleware of(
            final List<Map.Entry<Predicate<ApiHttpRequest>, List<Policy<ApiHttpResponse<byte[]>>>>> policies,
            final Scheduler scheduler) {
        return new RequestPolicyMiddlewareImpl(scheduler, policies);
    }

    public static PolicyMiddleware of(
            final List<Map.Entry<Predicate<ApiHttpRequest>, List<Policy<ApiHttpResponse<byte[]>>>>> policies,
            final ScheduledExecutorService scheduler) {
        return new RequestPolicyMiddlewareImpl(Scheduler.of(scheduler), policies);
    }

    public static PolicyMiddleware of(
            final List<Map.Entry<Predicate<ApiHttpRequest>, List<Policy<ApiHttpResponse<byte[]>>>>> policies,
            final ExecutorService scheduler) {
        return new RequestPolicyMiddlewareImpl(Scheduler.of(scheduler), policies);
    }

}
