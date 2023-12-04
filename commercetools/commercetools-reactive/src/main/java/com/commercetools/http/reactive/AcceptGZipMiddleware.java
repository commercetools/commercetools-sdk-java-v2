
package com.commercetools.http.reactive;

import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import org.reactivestreams.Publisher;

/**
 * Middleware to add the header {@code Accept: gzip} to the request
 */
public class AcceptGZipMiddleware implements Middleware {
    @Override
    public Publisher<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, Publisher<ApiHttpResponse<byte[]>>> next) {
        return next.apply(request.withHeader(ApiHttpHeaders.ACCEPT_ENCODING, "gzip"));
    }

    public static AcceptGZipMiddleware of() {
        return new AcceptGZipMiddleware();
    }
}
