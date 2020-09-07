package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import org.slf4j.Logger;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public final class LoggerMiddleware implements Middleware {

    private final Logger logger;

    public LoggerMiddleware(final Logger logger) {
        this.logger = logger;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request, Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return next.apply(request).whenComplete(
                (response, ex) -> {
                    String msg = String.format("%s %s %s", request.getMethod().name(), request.getUrl(), response.getStatusCode());
                    if (ex != null) {
                        logger.error(msg);
                    } else {
                        logger.info(msg);
                    }
                }
        );
    }
}
