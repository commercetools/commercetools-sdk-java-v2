
package io.vrap.rmf.base.client.http;

public interface InternalLoggerMiddleware extends Middleware {

    static InternalLoggerMiddleware of(InternalLoggerFactory internalLoggerFactory) {
        return new InternalLoggerMiddlewareImpl(internalLoggerFactory);
    }
}
