
package io.vrap.rmf.base.client.http;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import io.vrap.rmf.base.client.*;

import dev.failsafe.Failsafe;
import dev.failsafe.FailsafeExecutor;
import dev.failsafe.Policy;
import dev.failsafe.spi.Scheduler;

/**
 * Implementation for a failsafe requests handling
 */
public class PolicyMiddlewareImpl implements AutoCloseable, PolicyMiddleware {

    private final FailsafeExecutor<ApiHttpResponse<byte[]>> failsafeExecutor;

    PolicyMiddlewareImpl(final Scheduler scheduler, final List<Policy<ApiHttpResponse<byte[]>>> policies) {
        this.failsafeExecutor = Failsafe.with(policies).with(scheduler);
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
