package client;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class ApiHttpClient {

    private final Middleware reducedMiddleware;

    public ApiHttpClient(final List<Middleware> middlewares) {
        final List<Middleware> middlewareList = new ArrayList<>();
        middlewareList.addAll(middlewares);
        middlewareList.add(NoOpMiddleware.INSTANCE);
        this.reducedMiddleware = middlewareList.stream().reduce(ApiHttpClient::reduceMiddlewares).get();
    }

    public CompletableFuture<ApiHttpResponse> execute(final ApiHttpRequest request) {
        return reducedMiddleware
                .next(MiddlewareArg.from(request))
                .thenApply(middlewareArg -> {
                    if (middlewareArg.getError() == null) {
                        return middlewareArg.getResponse();
                    }
                    throw new CompletionException(middlewareArg.getError());
                });
    }

    public ApiHttpResponse executeBlocking(ApiHttpRequest request) {
        try {
            return execute(request).get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Middleware reduceMiddlewares(Middleware middleware1, Middleware middleware2) {
        return arg -> {
            Middleware intermediateMiddleware = intermediateOpArg -> middleware2.next(MiddlewareArg.from(intermediateOpArg.getRequest(), intermediateOpArg.getResponse(), intermediateOpArg.getError(), arg.getNext()));
            return middleware1.next(MiddlewareArg.from(arg.getRequest(), arg.getResponse(), arg.getError(), intermediateMiddleware));
        };
    }
}
