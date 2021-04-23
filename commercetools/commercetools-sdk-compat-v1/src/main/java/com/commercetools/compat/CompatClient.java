
package com.commercetools.compat;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import io.sphere.sdk.client.SphereRequest;
import io.vrap.rmf.base.client.*;

public class CompatClient implements ApiHttpClient {
    private final ApiHttpClient client;
    private final String projectKey;

    private CompatClient(final ApiHttpClient client, final String projectKey) {
        this.client = client;
        this.projectKey = projectKey;
    }

    public static CompatClient of(final ApiHttpClient client, final String projectKey) {
        return new CompatClient(client, projectKey);
    }

    public <O, TO> CompletableFuture<ApiHttpResponse<O>> execute(final SphereRequest<TO> request,
            final Class<O> outputType) {
        final CompatRequest<O> compatRequest = CompatRequest.of(client, projectKey, request, outputType);
        return compatRequest.execute(client);
    }

    public <O, TO> ApiHttpResponse<O> executeBlocking(final SphereRequest<TO> request, final Class<O> outputType) {
        final CompatRequest<O> compatRequest = CompatRequest.of(client, projectKey, request, outputType);
        return compatRequest.executeBlocking(client);
    }

    public <O, TO> ApiHttpResponse<O> executeBlocking(final SphereRequest<TO> request, final Class<O> outputType,
            Duration duration) {
        final CompatRequest<O> compatRequest = CompatRequest.of(client, projectKey, request, outputType);
        return compatRequest.executeBlocking(client, duration);
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(ApiHttpRequest request, Class<O> outputType) {
        return client.execute(request, outputType);
    }

    @Override
    public <O> CompletableFuture<ApiHttpResponse<O>> execute(ClientRequestCommand<O> method) {
        return client.execute(method);
    }

    @Override
    public ResponseSerializer getSerializerService() {
        return client.getSerializerService();
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
        return client.execute(request);
    }

    @Override
    public void close() throws Exception {
        client.close();
    }
}
