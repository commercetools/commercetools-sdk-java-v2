
package com.commercetools.http.reactive;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.AutoCloseableService;

import org.reactivestreams.Publisher;

/**
 * Handler to execute the given request using a HTTP client
 */
public class HttpHandler extends AutoCloseableService implements ReactiveHttpClient {
    private final ReactiveHttpClient httpClient;

    public HttpHandler(final ReactiveHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public static HttpHandler create(final ReactiveHttpClient httpClient) {
        return new HttpHandler(httpClient);
    }

    public Publisher<ApiHttpResponse<byte[]>> execute(final ApiHttpRequest apiHttpRequest) {
        return httpClient.execute(apiHttpRequest);
    }

    @Override
    protected void internalClose() {
        if (httpClient instanceof AutoCloseable)
            closeQuietly((AutoCloseable) httpClient);
    }
}
