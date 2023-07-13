
package io.vrap.rmf.base.client;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

public interface ClientRequestCommand<TResult> {
    CompletableFuture<ApiHttpResponse<TResult>> execute(final ApiHttpClient client);

    default ApiHttpResponse<TResult> executeBlocking(final ApiHttpClient client) {
        return executeBlocking(client, ApiHttpClient.DEFAULT_TIMEOUT);
    }

    ApiHttpResponse<TResult> executeBlocking(final ApiHttpClient client, final Duration timeout);
}
