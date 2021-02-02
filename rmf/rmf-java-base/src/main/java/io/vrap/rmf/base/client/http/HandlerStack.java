
package io.vrap.rmf.base.client.http;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.AutoCloseableService;

public class HandlerStack extends AutoCloseableService {
    private final HttpHandler handler;

    private final List<Middleware> middlewares;

    private Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> cached;

    private HandlerStack(final HttpHandler handler, final List<Middleware> middlewares) {
        this.handler = handler;
        this.middlewares = middlewares;
        this.cached = null;
    }

    public static HandlerStack create(final HttpHandler handler, List<Middleware> middlewares) {
        return new HandlerStack(handler, middlewares);
    }

    public static HandlerStack create(final HttpHandler handler) {
        return create(handler, new ArrayList<>());
    }

    public void addMiddleware(Middleware middleware) {
        this.middlewares.add(middleware);
        this.cached = null;
    }

    public void addMiddlewares(List<Middleware> middlewares) {
        this.middlewares.addAll(middlewares);
        this.cached = null;
    }

    public void addMiddlewares(Middleware... middlewares) {
        this.middlewares.addAll(Arrays.asList(middlewares));
        this.cached = null;
    }

    Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> resolve() {
        if (cached == null) {
            List<Middleware> stack = new ArrayList<>(middlewares);

            Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> prev = handler::execute;

            for (Middleware middleware : stack) {
                Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> finalPrev = prev;
                prev = (request) -> middleware.invoke(request, finalPrev);
            }

            cached = prev;
        }

        return cached;
    }

    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request) {
        Function<ApiHttpRequest, CompletableFuture<ApiHttpResponse<byte[]>>> handler = resolve();

        return handler.apply(request);
    }

    @Override
    protected void internalClose() {
        handler.close();
        middlewares.forEach(middleware -> {
            if (middleware instanceof AutoCloseable) {
                closeQuietly((AutoCloseable) middleware);
            }
        });
    }
}
