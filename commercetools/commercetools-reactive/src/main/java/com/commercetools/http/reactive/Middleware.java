
package com.commercetools.http.reactive;

import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import org.reactivestreams.Publisher;

/**
 * Interface for a HTTP middleware used to modify a request and the response
 */
@FunctionalInterface
public interface Middleware {

    Publisher<ApiHttpResponse<byte[]>> invoke(final ApiHttpRequest request,
            final Function<ApiHttpRequest, Publisher<ApiHttpResponse<byte[]>>> next);

}
