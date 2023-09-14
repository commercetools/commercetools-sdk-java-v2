
package io.vrap.rmf.base.client;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public interface RequestCommand<TResult> {
    CompletableFuture<ApiHttpResponse<TResult>> execute();

    default ApiHttpResponse<TResult> executeBlocking() {
        return executeBlocking(ApiHttpClient.DEFAULT_TIMEOUT);
    }

    ApiHttpResponse<TResult> executeBlocking(final Duration timeout);
}
