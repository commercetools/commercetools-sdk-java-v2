
package io.vrap.rmf.base.client;

import java.net.URI;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

import io.vrap.rmf.base.client.http.HandlerStack;

/**
 * Interface for an HTTP client accessing the API and mapping to a known output type
 */
public interface ApiHttpClient extends AutoCloseable, VrapHttpClient {
    public String CLOSED_MESSAGE = "Client is already closed.";

    public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request, final Class<O> outputType);

    public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
            final TypeReference<O> outputType);

    public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request, final JavaType outputType);

    public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ClientRequestCommand<O> method);

    public ResponseSerializer getSerializerService();

    public static ApiHttpClient of(final String baseUri, final HandlerStack stack) {
        return of(URI.create(baseUri), stack, ResponseSerializer.of());
    }

    public static ApiHttpClient of(final URI baseUri, final HandlerStack stack) {
        return of(baseUri, stack, ResponseSerializer.of());
    }

    public static ApiHttpClient of(final String baseUri, final HandlerStack stack,
            final ResponseSerializer serializer) {
        return of(URI.create(baseUri), stack, serializer);
    }

    public static ApiHttpClient of(final URI baseUri, final HandlerStack stack, final ResponseSerializer serializer) {
        return new ApiHttpClientImpl(baseUri, stack, serializer);
    }
}
