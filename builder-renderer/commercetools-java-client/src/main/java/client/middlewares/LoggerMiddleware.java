package client.middlewares;

import client.Middleware;
import client.MiddlewareArg;
import json.CommercetoolsJsonUtils;

import java.util.concurrent.CompletableFuture;

public final class LoggerMiddleware implements Middleware {


    //Todo this should be done as a proper logger
    @Override
    public CompletableFuture<MiddlewareArg> next(MiddlewareArg arg) {
        try {
            System.out.println(CommercetoolsJsonUtils.toJsonString(arg));
        } catch (Exception e) {
            System.out.println(e);
        }
        return arg.getNext().next(arg);
    }
}
