package io.vrap.rmf.base.client.middlewares;

import io.vrap.rmf.base.client.middlewares.Middleware;
import io.vrap.rmf.base.client.middlewares.MiddlewareArg;

import java.util.concurrent.CompletableFuture;

@Deprecated
public enum NoOpMiddleware implements Middleware {

    INSTANCE;

    @Override
    public CompletableFuture<MiddlewareArg> next(MiddlewareArg arg) {
        return CompletableFuture.completedFuture(arg);
    }
}
