
package com.commercetools.http.reactive;

import java.net.URI;
import java.util.function.Function;

import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.CreateHttpRequestCommand;
import io.vrap.rmf.base.client.ResponseSerializer;

import org.reactivestreams.Publisher;

import reactor.core.publisher.Mono;

public class ApiHttpClientImpl implements ApiHttpClient {
    private final HandlerStack stack;
    private final URI baseUri;
    private final ResponseSerializer serializer;

    public ApiHttpClientImpl(final String baseUri, final HandlerStack stack) {
        this(URI.create(baseUri), stack, ResponseSerializer.of());
    }

    public ApiHttpClientImpl(final URI baseUri, final HandlerStack stack) {
        this(baseUri, stack, ResponseSerializer.of());
    }

    public ApiHttpClientImpl(final URI baseUri, final HandlerStack stack, final ResponseSerializer serializer) {
        this.stack = stack;
        this.baseUri = baseUri;
        this.serializer = serializer;
    }

    @Override
    public ResponseSerializer getSerializerService() {
        return serializer;
    }

    @Override
    public URI getBaseUri() {
        return baseUri;
    }

    @Override
    public <O> Publisher<ApiHttpResponse<O>> execute(ApiHttpRequest request,
            Function<ApiHttpResponse<byte[]>, ApiHttpResponse<O>> mapper) {
        return Mono.from(stack.execute(request.resolve(baseUri))).map(mapper);
    }

    @Override
    public Publisher<ApiHttpResponse<byte[]>> send(CreateHttpRequestCommand method) {
        return stack.invoke(method.createHttpRequest());
    }
}
