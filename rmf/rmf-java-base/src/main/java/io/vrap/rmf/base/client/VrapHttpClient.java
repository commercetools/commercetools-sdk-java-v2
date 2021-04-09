
package io.vrap.rmf.base.client;

import java.util.concurrent.CompletableFuture;

@FunctionalInterface
public interface VrapHttpClient {

    CompletableFuture<ApiHttpResponse<byte[]>> execute(final ApiHttpRequest request);

}
