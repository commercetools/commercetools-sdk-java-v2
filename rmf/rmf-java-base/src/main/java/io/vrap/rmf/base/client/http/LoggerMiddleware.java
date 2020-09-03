package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public final class LoggerMiddleware implements Middleware {

    private final Logger logger;
    private final Level logLevel;

    public LoggerMiddleware(final Logger logger, final Level logLevel) {
        this.logger = logger;
        this.logLevel = logLevel;
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request, Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> next) {
        return next.apply(request).whenComplete(
                (response, ex) -> {
                    String msg = String.format("%s %s %s", request.getMethod().name(), request.fullUrl(), response.getStatusCode());
                    LogRecord r = new LogRecord((ex != null) ? Level.SEVERE : logLevel, msg);
                    logger.log(r);
                }
        );
    }
}
