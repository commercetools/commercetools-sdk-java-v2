
package io.vrap.rmf.base.client.http;

import java.util.Set;
import java.util.function.Predicate;

import io.vrap.rmf.base.client.ApiHttpMethod;
import io.vrap.rmf.base.client.ApiHttpRequest;

/**
 * Middleware to convert a {@link io.vrap.rmf.base.client.error.NotFoundException} to a response with a null body value
 */
public interface NotFoundExceptionMiddleware extends Middleware {

    static NotFoundExceptionMiddleware of() {
        return new NotFoundExceptionMiddlewareImpl();
    }

    static NotFoundExceptionMiddleware of(final Set<ApiHttpMethod> methods) {
        return new NotFoundExceptionMiddlewareImpl(apiHttpRequest -> methods.contains(apiHttpRequest.getMethod()));
    }

    static NotFoundExceptionMiddleware of(final Predicate<ApiHttpRequest> requestPredicate) {
        return new NotFoundExceptionMiddlewareImpl(requestPredicate);
    }
}
