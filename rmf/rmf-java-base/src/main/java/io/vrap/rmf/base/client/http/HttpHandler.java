package io.vrap.rmf.base.client.http;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.VrapHttpClient;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class HttpHandler {

    private final VrapHttpClient httpClient;

    public HttpHandler(final VrapHttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public static HttpHandler create(final VrapHttpClient httpClient) {
        return new HttpHandler(httpClient);
    }

    public CompletableFuture<ApiHttpResponse<byte[]>> execute(final ApiHttpRequest apiHttpRequest, Map<String, Object> options) {
        return httpClient.execute(apiHttpRequest);
    }

    public CompletableFuture<ApiHttpResponse<byte[]>> invoke(ApiHttpRequest arg) {
        return execute(arg, null);
    }
}
