
package io.vrap.rmf.base.client.http;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import dev.failsafe.Bulkhead;
import dev.failsafe.Failsafe;
import dev.failsafe.FailsafeExecutor;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

public class QueueMiddleware implements Middleware, AutoCloseable {

    private final FailsafeExecutor<ApiHttpResponse<byte[]>> failsafeExecutor;

    public QueueMiddleware(final int maxConnections, final Duration maxWaitTime) {
        final Bulkhead<ApiHttpResponse<byte[]>> bulkhead = Bulkhead.<ApiHttpResponse<byte[]>> builder(maxConnections)
                .withMaxWaitTime(maxWaitTime)
                .build();
        this.failsafeExecutor = Failsafe.with(bulkhead);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return failsafeExecutor.getStageAsync(() -> next.apply(request));
    }

    @Override
    public void close() {
    }
}
