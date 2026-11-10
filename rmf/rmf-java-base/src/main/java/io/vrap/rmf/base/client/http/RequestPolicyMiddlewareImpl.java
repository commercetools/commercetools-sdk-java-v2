
package io.vrap.rmf.base.client.http;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import dev.failsafe.Failsafe;
import dev.failsafe.FailsafeExecutor;
import dev.failsafe.Policy;
import dev.failsafe.spi.Scheduler;

/**
 * Implementation for a failsafe requests handling
 */
public class RequestPolicyMiddlewareImpl implements AutoCloseable, PolicyMiddleware {

    private final List<Map.Entry<Predicate<ApiHttpRequest>, FailsafeExecutor<ApiHttpResponse<byte[]>>>> executors;

    RequestPolicyMiddlewareImpl(final Scheduler scheduler,
            final List<Map.Entry<Predicate<ApiHttpRequest>, List<Policy<ApiHttpResponse<byte[]>>>>> policies) {
        this.executors = policies.stream()
                .map(entry -> Map.entry(entry.getKey(), Failsafe.with(entry.getValue()).with(scheduler)))
                .collect(Collectors.toList());
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {

        Optional<FailsafeExecutor<ApiHttpResponse<byte[]>>> failsafeExecutor = executors.stream()
                .filter(entry -> entry.getKey().test(request))
                .findFirst()
                .map(Map.Entry::getValue);
        if (failsafeExecutor.isPresent()) {
            return failsafeExecutor.get().getStageAsync(() -> next.apply(request));
        }
        return next.apply(request);
    }

    @Override
    public void close() {
    }
}
