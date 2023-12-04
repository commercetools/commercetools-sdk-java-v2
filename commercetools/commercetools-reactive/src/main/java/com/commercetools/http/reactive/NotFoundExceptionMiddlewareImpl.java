
package com.commercetools.http.reactive;

import java.util.function.Function;
import java.util.function.Predicate;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.error.NotFoundException;

import org.reactivestreams.Publisher;

import reactor.core.publisher.Mono;

public class NotFoundExceptionMiddlewareImpl implements NotFoundExceptionMiddleware {

    private final Predicate<ApiHttpRequest> requestPredicate;

    public NotFoundExceptionMiddlewareImpl() {
        requestPredicate = apiHttpRequest -> true;
    }

    public NotFoundExceptionMiddlewareImpl(final Predicate<ApiHttpRequest> requestPredicate) {
        this.requestPredicate = requestPredicate;
    }

    @Override
    public Publisher<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, Publisher<ApiHttpResponse<byte[]>>> next) {
        return Mono.from(next.apply(request)).onErrorResume(throwable -> {
            if (throwable instanceof NotFoundException && requestPredicate.test(request)) {
                ApiHttpResponse<byte[]> response = ((NotFoundException) throwable.getCause()).getResponse();
                return Mono.just(new ApiHttpResponse<>(response.getStatusCode(), response.getHeaders(), null,
                    response.getMessage(), response.getContextMap()));
            }
            return Mono.error(throwable);
        });
    }
}
