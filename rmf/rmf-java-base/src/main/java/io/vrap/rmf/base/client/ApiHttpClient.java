
package io.vrap.rmf.base.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

import io.vrap.rmf.base.client.http.HandlerStack;

/**
 * Interface for an HTTP client accessing the API and mapping to a known output type
 */
public interface ApiHttpClient extends AutoCloseable, VrapHttpClient {
    public String CLOSED_MESSAGE = "Client is already closed.";

    static Duration DEFAULT_TIMEOUT = Duration.ofSeconds(120);

    default public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
            final Class<O> outputType) {
        return execute(request).thenApply(response -> getSerializerService().convertResponse(response, outputType));
    }

    default public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
            final TypeReference<O> outputType) {
        return execute(request).thenApply(response -> getSerializerService().convertResponse(response, outputType));
    }

    default public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
            final JavaType outputType) {
        return execute(request).thenApply(response -> getSerializerService().convertResponse(response, outputType));
    }

    default public <O> ApiHttpResponse<O> executeBlocking(final ApiHttpRequest request, final Class<O> outputType,
            Duration timeout) {
        return blockingWait(execute(request, outputType), request, timeout);
    }

    default public <O> ApiHttpResponse<O> executeBlocking(final ApiHttpRequest request,
            final TypeReference<O> outputType, Duration timeout) {
        return blockingWait(execute(request, outputType), request, timeout);
    }

    default public <O> ApiHttpResponse<O> executeBlocking(final ApiHttpRequest request, final JavaType outputType,
            Duration timeout) {
        return blockingWait(execute(request, outputType), request, timeout);
    }

    default public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ClientRequestCommand<O> method) {
        return method.execute(this);
    }

    default public <T, O> CompletableFuture<ApiHttpResponse<O>> execute(final ClientRequestCommand<T> method,
            final Class<O> outputType) {
        return execute(method.createHttpRequest(), outputType);
    }

    default public <T, O> CompletableFuture<ApiHttpResponse<O>> execute(final ClientRequestCommand<T> method,
            final JavaType outputType) {
        return execute(method.createHttpRequest(), outputType);
    }

    default public <T, O> CompletableFuture<ApiHttpResponse<O>> execute(final ClientRequestCommand<T> method,
            final TypeReference<O> outputType) {
        return execute(method.createHttpRequest(), outputType);
    }

    default public <O> ApiHttpResponse<O> executeBlocking(final ClientRequestCommand<O> method, Duration timeout) {
        return method.executeBlocking(this, timeout);
    }

    default public <T, O> ApiHttpResponse<O> executeBlocking(final ClientRequestCommand<T> method,
            final Class<O> outputType, Duration timeout) {
        return executeBlocking(method.createHttpRequest(), outputType, timeout);
    }

    default public <T, O> ApiHttpResponse<O> executeBlocking(final ClientRequestCommand<T> method,
            final JavaType outputType, Duration timeout) {
        return executeBlocking(method.createHttpRequest(), outputType, timeout);
    }

    default public <T, O> ApiHttpResponse<O> executeBlocking(final ClientRequestCommand<T> method,
            final TypeReference<O> outputType, Duration timeout) {
        return executeBlocking(method.createHttpRequest(), outputType, timeout);
    }

    default public <O> ApiHttpResponse<O> executeBlocking(final ClientRequestCommand<O> method) {
        return executeBlocking(method, DEFAULT_TIMEOUT);
    }

    default public <T, O> ApiHttpResponse<O> executeBlocking(final ClientRequestCommand<T> method,
            final Class<O> outputType) {
        return executeBlocking(method, outputType, DEFAULT_TIMEOUT);
    }

    default public <T, O> ApiHttpResponse<O> executeBlocking(final ClientRequestCommand<T> method,
            final JavaType outputType) {
        return executeBlocking(method, outputType, DEFAULT_TIMEOUT);
    }

    default public <T, O> ApiHttpResponse<O> executeBlocking(final ClientRequestCommand<T> method,
            final TypeReference<O> outputType) {
        return executeBlocking(method, outputType, DEFAULT_TIMEOUT);
    }

    default public <T> CompletableFuture<ApiHttpResponse<byte[]>> send(final ClientRequestCommand<T> method) {
        return execute(method.createHttpRequest());
    }

    default public <T> ApiHttpResponse<byte[]> sendBlocking(final ClientRequestCommand<T> method) {
        return blockingWait(send(method), DEFAULT_TIMEOUT);
    };

    default public <T> ApiHttpResponse<byte[]> sendBlocking(final ClientRequestCommand<T> method,
            final Duration timeout) {
        return blockingWait(send(method), timeout);
    }

    public ResponseSerializer getSerializerService();

    public URI getBaseUri();

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
