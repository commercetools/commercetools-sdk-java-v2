package io.vrap.rmf.base.client;

import io.vrap.rmf.base.client.http.HandlerStack;

import java.net.URI;
import java.util.concurrent.CompletableFuture;

public class ApiHttpClient {

    private final HandlerStack stack;
    private final URI baseUri;
    private final ResponseSerializer serializer = new ResponseSerializer();

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

    public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request, Class<O> outputType)
    {
        return execute(request).thenApply(response -> serializer.convertResponse(response, outputType));
    }

    public ResponseSerializer getSerializerService() {
        return serializer;
    }
}
