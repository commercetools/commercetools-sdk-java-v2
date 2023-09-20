
package com.commercetools.http.reactive;

import java.time.Duration;
import java.util.function.Function;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;

import io.vrap.rmf.base.client.*;

import org.reactivestreams.Publisher;

public interface PublisherApiClient extends AsyncApiClient<Publisher<?>> {
    @Override
    <O> Publisher<ApiHttpResponse<O>> execute(final ApiHttpRequest request, final Class<O> outputType);

    @Override
    <O> Publisher<ApiHttpResponse<O>> execute(final ApiHttpRequest request, final TypeReference<O> outputType);

    @Override
    <O> Publisher<ApiHttpResponse<O>> execute(final ApiHttpRequest request, final JavaType outputType);

    @Override
    <O> Publisher<ApiHttpResponse<O>> execute(final ApiHttpRequest request,
            final Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper);

    @Override
    <O> Publisher<ApiHttpResponse<O>> execute(final HttpRequestCommand<O> method);

    @Override
    <T, O> Publisher<ApiHttpResponse<O>> execute(final CreateHttpRequestCommand method, final Class<O> outputType);

    @Override
    <O> Publisher<ApiHttpResponse<O>> execute(final CreateHttpRequestCommand method, final JavaType outputType);

    @Override
    <O> Publisher<ApiHttpResponse<O>> execute(final CreateHttpRequestCommand method, final TypeReference<O> outputType);

    @Override
    <O> Publisher<ApiHttpResponse<O>> execute(final CreateHttpRequestCommand method,
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
    Publisher<ApiHttpResponse<byte[]>> send(final CreateHttpRequestCommand method);

    @Override
    <T> ApiHttpResponse<byte[]> sendBlocking(final CreateHttpRequestCommand method, final Duration timeout);
}
