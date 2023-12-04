
package com.commercetools.http.reactive;

import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import org.reactivestreams.Publisher;

import reactor.core.publisher.Mono;

public class PolicyMiddlewareImpl implements PolicyMiddleware {

    @Override
    public Publisher<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest request,
            Function<ApiHttpRequest, Publisher<ApiHttpResponse<byte[]>>> next) {
        return Mono.from(next.apply(request));
    }
}
