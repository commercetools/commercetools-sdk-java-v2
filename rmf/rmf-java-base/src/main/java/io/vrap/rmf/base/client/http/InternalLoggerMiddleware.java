package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class InternalLoggerMiddleware implements Middleware {
    private final Function<ApiHttpRequest, InternalLogger> factory;

    public InternalLoggerMiddleware(Function<ApiHttpRequest, InternalLogger> factory) {
        this.factory = factory;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request, Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        InternalLogger logger = factory.apply(request);
        logger.debug(() -> request);
        return next.apply(request).whenComplete(
                (response, throwable) -> {
                    if (throwable != null) {
                        logger.error(() -> response, throwable);
                    } else {
                        logger.debug(() -> response);
                    }
                }
        );
    }
}
