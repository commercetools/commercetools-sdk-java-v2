package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.HandlerStack;

import java.net.URI;
import java.util.concurrent.CompletableFuture;

public interface ApiHttpClient extends AutoCloseable, VrapHttpClient {
    public String CLOSED_MESSAGE = "Client is already closed.";

    public <O> CompletableFuture<ApiHttpResponse<O>> execute(ApiHttpRequest request, Class<O> outputType);

    public ResponseSerializer getSerializerService();

    public static ApiHttpClient of(final String baseUri, final HandlerStack stack) {
        return of(URI.create(baseUri), stack, ResponseSerializer.of());
    }

    public static ApiHttpClient of(final URI baseUri, final HandlerStack stack) {
        return of(baseUri, stack, ResponseSerializer.of());
    }

    public static ApiHttpClient of(final URI baseUri, final HandlerStack stack, ResponseSerializer serializer) {
        return new ApiHttpClientImpl(baseUri, stack, serializer);
    }
}
