package client;

import java.util.concurrent.CompletableFuture;

public enum NoOpMiddleware implements Middleware {

    INSTANCE;

    @Override
    public CompletableFuture<MiddlewareArg> next(MiddlewareArg arg) {
        return CompletableFuture.completedFuture(arg);
    }
}
