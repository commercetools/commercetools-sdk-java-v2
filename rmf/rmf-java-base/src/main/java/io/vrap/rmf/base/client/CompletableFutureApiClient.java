
package io.vrap.rmf.base.client;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

public interface CompletableFutureApiClient extends AsyncApiClient<CompletableFuture<?>> {

    @Override
    <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request, final Class<O> outputType);

    @Override
    <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request, final TypeReference<O> outputType);

    @Override
    <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request, final JavaType outputType);

    @Override
    <O> CompletableFuture<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
            final Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper);

    @Override
    <O> CompletableFuture<ApiHttpResponse<O>> execute(final HttpRequestCommand<O> method);

    @Override
    <T, O> CompletableFuture<ApiHttpResponse<O>> execute(final CreateHttpRequestCommand method,
            final Class<O> outputType);

    @Override
    <O> CompletableFuture<ApiHttpResponse<O>> execute(final CreateHttpRequestCommand method, final JavaType outputType);

    @Override
    <O> CompletableFuture<ApiHttpResponse<O>> execute(final CreateHttpRequestCommand method,
            final TypeReference<O> outputType);

    @Override
    <O> CompletableFuture<ApiHttpResponse<O>> execute(final CreateHttpRequestCommand method,
            final Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper);

    @Override
    <O> ApiHttpResponse<O> executeBlocking(final CreateHttpRequestCommand method,
            final Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper, Duration timeout);

    @Override
    <O> ApiHttpResponse<O> executeBlocking(final CreateHttpRequestCommand method, final Class<O> outputType,
            Duration timeout);

    @Override
    <O> ApiHttpResponse<O> executeBlocking(final CreateHttpRequestCommand method, final JavaType outputType,
            Duration timeout);

    @Override
    <O> ApiHttpResponse<O> executeBlocking(final CreateHttpRequestCommand method, final TypeReference<O> outputType,
            Duration timeout);

    @Override
    CompletableFuture<ApiHttpResponse<byte[]>> send(final CreateHttpRequestCommand method);

    @Override
    <T> ApiHttpResponse<byte[]> sendBlocking(final CreateHttpRequestCommand method, final Duration timeout);
}
