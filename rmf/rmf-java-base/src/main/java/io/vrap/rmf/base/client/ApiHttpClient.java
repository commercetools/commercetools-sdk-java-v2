package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.HandlerStack;

import java.net.URI;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class ApiHttpClient {

    private final HandlerStack stack;
    private final URI baseUri;

    public ApiHttpClient(final String baseUri, final HandlerStack stack) {
        this(URI.create(baseUri), stack);
    }

    public ApiHttpClient(final URI baseUri, final HandlerStack stack) {
        this.stack = stack;
        this.baseUri = baseUri;
    }

    public CompletableFuture<ApiHttpResponse<byte[]>> execute(final ApiHttpRequest request) {
        return stack.invoke(request.resolve(baseUri));
    }
}
