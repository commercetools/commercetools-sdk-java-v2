
package io.vrap.rmf.base.client.http;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

public class AcceptGZipMiddleware implements Middleware {
    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return next.apply(request.withHeader(ApiHttpHeaders.ACCEPT_ENCODING, "gzip"));
    }

    public static AcceptGZipMiddleware of() {
        return new AcceptGZipMiddleware();
    }
}
