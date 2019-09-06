package client;

import java.util.concurrent.CompletableFuture;

@FunctionalInterface
public interface Middleware {

    CompletableFuture<MiddlewareArg> next(MiddlewareArg arg);

}
