
package io.vrap.rmf.base.client;

import java.time.Duration;
import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

public interface AsyncApiClient<TReturn> {
    <O> TReturn execute(final ApiHttpRequest request, final Class<O> outputType);

    <O> TReturn execute(final ApiHttpRequest request, final TypeReference<O> outputType);

    <O> TReturn execute(final ApiHttpRequest request, final JavaType outputType);

    <O> TReturn execute(final ApiHttpRequest request,
            final Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper);

    <O> TReturn execute(final HttpRequestCommand<O> method);

    <T, O> TReturn execute(final CreateHttpRequestCommand method, final Class<O> outputType);

    <O> TReturn execute(final CreateHttpRequestCommand method, final JavaType outputType);

    <O> TReturn execute(final CreateHttpRequestCommand method, final TypeReference<O> outputType);

    <O> TReturn execute(final CreateHttpRequestCommand method,
            final Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper);

    <O> ApiHttpResponse<O> executeBlocking(final CreateHttpRequestCommand method,
            final Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper, Duration timeout);

    <O> ApiHttpResponse<O> executeBlocking(final CreateHttpRequestCommand method, final Class<O> outputType,
            Duration timeout);

    <O> ApiHttpResponse<O> executeBlocking(final CreateHttpRequestCommand method, final JavaType outputType,
            Duration timeout);

    <O> ApiHttpResponse<O> executeBlocking(final CreateHttpRequestCommand method, final TypeReference<O> outputType,
            Duration timeout);

    <T> TReturn send(final CreateHttpRequestCommand method);

    <T> ApiHttpResponse<byte[]> sendBlocking(final CreateHttpRequestCommand method, final Duration timeout);
}
