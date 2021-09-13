
package io.vrap.rmf.base.client;

import java.util.concurrent.CompletableFuture;

/**
 * Wrapper interface for a HTTP client
 */
@FunctionalInterface
public interface VrapHttpClient {

    CompletableFuture<ApiHttpResponse<byte[]>> execute(final ApiHttpRequest request);

}
