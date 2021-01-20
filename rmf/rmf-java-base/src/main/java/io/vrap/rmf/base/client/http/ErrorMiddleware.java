
package io.vrap.rmf.base.client.http;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.error.ExceptionFactory;

public class ErrorMiddleware implements Middleware {

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return next.apply(request).thenApply(response -> {
            if (response.getStatusCode() >= 400) {
                throw ExceptionFactory.create(request, response);
            }
            return response;
        });
    }

}
