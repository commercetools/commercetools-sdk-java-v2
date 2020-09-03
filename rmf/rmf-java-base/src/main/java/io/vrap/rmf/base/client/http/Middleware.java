package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Middleware {
    public static Function<BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>, BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>> mapRequest(Function<ApiHttpRequest, ApiHttpRequest> func) {
        return (BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>> handler) ->
                (BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>) (ApiHttpRequest request, Map<String, Object> options) -> handler.apply(func.apply(request), options);
    }

    public static Function<BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>, BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>> mapResponse(Function<ApiHttpResponse<byte[]>, ApiHttpResponse<byte[]>> func) {
        return (BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>> handler) ->
                (BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>) (ApiHttpRequest request, Map<String, Object> options) -> handler.apply(request, options).thenApply(func);
    }

    public static Function<BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>, BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>> log(Logger logger, Level logLevel) {
        return (BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>> handler) ->
                (BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>) (ApiHttpRequest request, Map<String, Object> options) -> handler.apply(request, options).whenComplete(
                        (response, ex) -> {
                            String msg = String.format("%s %s %s", request.getMethod().name(), request.fullUrl(), response.getStatusCode());
                            LogRecord r = new LogRecord((ex != null) ? Level.SEVERE : logLevel, msg);
                            logger.log(r);
                        }
                );
    }
}
