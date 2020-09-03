package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.middlewares.HttpMiddleware;
import io.vrap.rmf.base.client.middlewares.MiddlewareArg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Function;

public class HandlerStack {
    private final HttpHandler handler;

    private final List<Function<BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>, BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>>> middlewares;

    private BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>> cached;

    public HandlerStack(final HttpHandler handler) {
        this.handler = handler;
        this.middlewares = new ArrayList<>();
    }

    public static HandlerStack create(final HttpHandler handler)
    {
        final HandlerStack stack = new HandlerStack(handler);
        return stack;
    }

    public void addMiddleware(Function<BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>, BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>> middleware) {
        this.middlewares.add(middleware);
    }

    BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>> resolve() {
        if (cached == null) {
            List<Function<BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>, BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>>> stack = new ArrayList<>(middlewares);
            Collections.reverse(stack);

            BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>> prev = handler::execute;

            for (Function<BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>, BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>>> middleware : stack) {
                BiFunction<ApiHttpRequest, Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>> finalPrev = prev;
                prev = middleware.apply(finalPrev);
            }

            cached = prev;
        }

        return cached;
    }

    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request, final Map<String, Object> options) {
        BiFunction<ApiHttpRequest,  Map<String, Object>, CompletableFuture<ApiHttpResponse<byte[]>>> handler = resolve();

        return handler.apply(request, options);
    }
}
