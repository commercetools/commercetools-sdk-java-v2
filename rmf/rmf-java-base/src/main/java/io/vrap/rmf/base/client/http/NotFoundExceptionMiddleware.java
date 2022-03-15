
package io.vrap.rmf.base.client.http;

public interface NotFoundExceptionMiddleware extends Middleware {

    static NotFoundExceptionMiddleware of() {
        return new NotFoundExceptionMiddlewareImpl();
    }
}
