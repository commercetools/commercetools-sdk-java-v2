
package com.commercetools.http.reactive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.AutoCloseableService;

import org.reactivestreams.Publisher;

/**
 * The HandlerStack is used to execute the middlewares in order and transfer the request using the specified {@link HttpHandler}
 */
public class HandlerStack extends AutoCloseableService implements ReactiveHttpClient {
    public String CLOSED_MESSAGE = "Handler is already closed.";

    private final HttpHandler handler;

    private final List<Middleware> middlewares;

    private Function<ApiHttpRequest, Publisher<ApiHttpResponse<byte[]>>> cached;

    private HandlerStack(final HttpHandler handler, final List<Middleware> middlewares) {
        this.handler = handler;
        this.middlewares = middlewares;
        this.cached = null;
    }

    public static HandlerStack create(final HttpHandler handler, final List<Middleware> middlewares) {
        return new HandlerStack(handler, middlewares);
    }

    public static HandlerStack create(final HttpHandler handler) {
        return create(handler, new ArrayList<>());
    }

    public void addMiddleware(final Middleware middleware) {
        this.middlewares.add(middleware);
        this.cached = null;
    }

    public void addMiddlewares(final List<Middleware> middlewares) {
        this.middlewares.addAll(middlewares);
        this.cached = null;
    }

    public void addMiddlewares(final Middleware... middlewares) {
        this.middlewares.addAll(Arrays.asList(middlewares));
        this.cached = null;
    }

    Function<ApiHttpRequest, Publisher<ApiHttpResponse<byte[]>>> resolve() {
        if (cached == null) {
            List<Middleware> stack = new ArrayList<>(middlewares);

            Function<ApiHttpRequest, Publisher<ApiHttpResponse<byte[]>>> prev = handler::execute;

            for (Middleware middleware : stack) {
                Function<ApiHttpRequest, Publisher<ApiHttpResponse<byte[]>>> finalPrev = prev;
                prev = (request) -> middleware.invoke(request, finalPrev);
            }

            cached = prev;
        }

        return cached;
    }

    @Override
    public Publisher<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
        rejectExecutionIfClosed(CLOSED_MESSAGE);
        return invoke(request);
    }

    public Publisher<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request) {
        final Function<ApiHttpRequest, Publisher<ApiHttpResponse<byte[]>>> handler = resolve();

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
