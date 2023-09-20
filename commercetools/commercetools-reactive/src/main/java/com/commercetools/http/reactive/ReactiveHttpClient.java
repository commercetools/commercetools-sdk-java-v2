
package com.commercetools.http.reactive;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import org.reactivestreams.Publisher;

/**
 * Wrapper interface for a HTTP client
 */
@FunctionalInterface
public interface ReactiveHttpClient {
    Publisher<ApiHttpResponse<byte[]>> execute(final ApiHttpRequest request);
}
