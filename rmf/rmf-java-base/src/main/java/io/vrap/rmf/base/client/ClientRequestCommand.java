
package io.vrap.rmf.base.client;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public interface ClientRequestCommand<TResult> {
    CompletableFuture<ApiHttpResponse<TResult>> execute(final ApiHttpClient client);

    ApiHttpResponse<TResult> executeBlocking(final ApiHttpClient client);

    ApiHttpResponse<TResult> executeBlocking(final ApiHttpClient client, final Duration timeout);
}
