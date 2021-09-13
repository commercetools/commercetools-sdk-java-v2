
package io.vrap.rmf.base.client.http;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

/**
 * Middleware to add a user agent string as header to a request
 */
public class UserAgentMiddleware implements Middleware {
    private final String userAgent;

    public UserAgentMiddleware(final String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return next.apply(request.withHeader(ApiHttpHeaders.USER_AGENT, userAgent));
    }
}
