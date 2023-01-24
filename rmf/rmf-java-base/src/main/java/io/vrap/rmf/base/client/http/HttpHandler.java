
package io.vrap.rmf.base.client.http;

import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;

/**
 * Handler to execute the given request using a HTTP client
 */
public class HttpHandler extends AutoCloseableService implements VrapHttpClient {
    private final VrapHttpClient httpClient;

    public HttpHandler(final VrapHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public static HttpHandler create(final VrapHttpClient httpClient) {
        return new HttpHandler(httpClient);
    }

    public CompletableFuture<ApiHttpResponse<byte[]>> execute(final ApiHttpRequest apiHttpRequest) {
        return httpClient.execute(apiHttpRequest)
                .thenApply(response -> response.withContextMap(apiHttpRequest.getContextMap()));
    }

    @Override
    protected void internalClose() {
        if (httpClient instanceof AutoCloseable)
            closeQuietly((AutoCloseable) httpClient);
    }
}
