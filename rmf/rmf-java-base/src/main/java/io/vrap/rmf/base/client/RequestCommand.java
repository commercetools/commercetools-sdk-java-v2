
package io.vrap.rmf.base.client;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public interface RequestCommand<TResult> {
    CompletableFuture<ApiHttpResponse<TResult>> execute();

    ApiHttpResponse<TResult> executeBlocking();

    ApiHttpResponse<TResult> executeBlocking(final Duration timeout);
}
