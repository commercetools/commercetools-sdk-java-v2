
package io.vrap.rmf.base.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

import io.vrap.rmf.base.client.http.HandlerStack;

/**
 * Interface for an HTTP client accessing the API and mapping to a known output type
 */
public interface ApiHttpClient extends AutoCloseable, VrapHttpClient, CompletableFutureApiClient {
    public String CLOSED_MESSAGE = "Client is already closed.";

    static Duration DEFAULT_TIMEOUT = Duration.ofSeconds(120);

    default public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
            final Class<O> outputType) {
        return execute(request, apiHttpResponse -> getSerializerService().convertResponse(apiHttpResponse, outputType));
    }

    default public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
            final TypeReference<O> outputType) {
        return execute(request, apiHttpResponse -> getSerializerService().convertResponse(apiHttpResponse, outputType));
    }

    @Override
    default public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
            final JavaType outputType) {
        return execute(request, apiHttpResponse -> getSerializerService().convertResponse(apiHttpResponse, outputType));
    }

    default public <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
            final Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper) {
        return execute(request).thenApply(mapper);
    }

    default public <O> CompletableFuture<ApiHttpResponse<O>> execute(final HttpRequestCommand<O> method) {
        return execute(method.createHttpRequest(), method.resultType());
    }

    default public <T, O> CompletableFuture<ApiHttpResponse<O>> execute(final CreateHttpRequestCommand method,
            final Class<O> outputType) {
        return execute(method, apiHttpResponse -> getSerializerService().convertResponse(apiHttpResponse, outputType));
    }

    default public <O> CompletableFuture<ApiHttpResponse<O>> execute(final CreateHttpRequestCommand method,
            final JavaType outputType) {
        return execute(method, apiHttpResponse -> getSerializerService().convertResponse(apiHttpResponse, outputType));
    }

    default public <O> CompletableFuture<ApiHttpResponse<O>> execute(final CreateHttpRequestCommand method,
            final TypeReference<O> outputType) {
        return execute(method, apiHttpResponse -> getSerializerService().convertResponse(apiHttpResponse, outputType));
    }

    default public <O> CompletableFuture<ApiHttpResponse<O>> execute(final CreateHttpRequestCommand method,
            final Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper) {
        return execute(method.createHttpRequest()).thenApply(mapper);
    }

    default public <O> ApiHttpResponse<O> executeBlocking(final CreateHttpRequestCommand method,
            final Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper, Duration timeout) {
        ApiHttpRequest request = method.createHttpRequest();
        return blockingWait(execute(request).thenApply(mapper), request, timeout);
    }

    default public <O> ApiHttpResponse<O> executeBlocking(final CreateHttpRequestCommand method,
            final Class<O> outputType, Duration timeout) {
        return executeBlocking(method,
            apiHttpResponse -> getSerializerService().convertResponse(apiHttpResponse, outputType), timeout);
    }

    default public <O> ApiHttpResponse<O> executeBlocking(final CreateHttpRequestCommand method,
            final JavaType outputType, Duration timeout) {
        return executeBlocking(method,
            apiHttpResponse -> getSerializerService().convertResponse(apiHttpResponse, outputType), timeout);
    }

    default public <O> ApiHttpResponse<O> executeBlocking(final CreateHttpRequestCommand method,
            final TypeReference<O> outputType, Duration timeout) {
        return executeBlocking(method,
            apiHttpResponse -> getSerializerService().convertResponse(apiHttpResponse, outputType), timeout);
    }

    default public CompletableFuture<ApiHttpResponse<byte[]>> send(final CreateHttpRequestCommand method) {
        return execute(method.createHttpRequest());
    }

    default public <T> ApiHttpResponse<byte[]> sendBlocking(final CreateHttpRequestCommand method,
            final Duration timeout) {
        ApiHttpRequest request = method.createHttpRequest();
        return blockingWait(execute(request), request, timeout);
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
