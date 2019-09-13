package io.vrap.rmf.base.client.middlewares;

import io.vrap.rmf.base.client.utils.json.VrapJsonUtils;

import java.util.concurrent.CompletableFuture;

public final class LoggerMiddleware implements Middleware {


    //Todo this should be done as a proper logger
    @Override
    public CompletableFuture<MiddlewareArg> next(MiddlewareArg arg) {
//        try {
//            System.out.println(new String(VrapJsonUtils.toJsonByteArray(arg)));
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        return arg.getNext().next(arg);
    }
}
