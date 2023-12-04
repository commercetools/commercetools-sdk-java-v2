
package com.commercetools.http.netty;

import java.util.Objects;
import java.util.function.BiFunction;

import com.commercetools.http.reactive.ReactiveHttpClient;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelOption;
import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.resolver.DefaultAddressResolverGroup;
import io.netty.util.AsciiString;
import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;

import org.reactivestreams.Publisher;

import reactor.core.publisher.Mono;
import reactor.netty.ByteBufMono;
import reactor.netty.NettyOutbound;
import reactor.netty.http.client.HttpClient;
import reactor.netty.http.client.HttpClientRequest;
import reactor.netty.http.client.HttpClientResponse;
import reactor.netty.resources.ConnectionProvider;

public class CtNettyReactiveHttpClient implements ReactiveHttpClient {
    @Override
    public Publisher<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
        final HttpMethod method = HttpMethod.valueOf(request.getMethod().name());
        return nettyClient.request(method)
                .uri(request.getUri())
                .send(toNettyRequest(request))
                .responseSingle(toApiResponse());
    }

    public static final int MAX_REQUESTS = 64;
    private static final byte[] EMPTY_BYTES = new byte[0];

    private final HttpClient nettyClient;

    public CtNettyReactiveHttpClient() {
        this(MAX_REQUESTS);
    }

    public CtNettyReactiveHttpClient(int maxConnections) {
        this.nettyClient = createDefaultClient(maxConnections);
        this.nettyClient.warmup();
    }

    public static HttpClient createDefaultClient(final int maxConnections) {
        return HttpClient.create(ConnectionProvider.create("commercetools", maxConnections))
                .secure()
                .compress(true)
                .resolver(DefaultAddressResolverGroup.INSTANCE)
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 10000);
    }

    private static BiFunction<HttpClientRequest, NettyOutbound, Publisher<Void>> toNettyRequest(
            final ApiHttpRequest httpRequest) {
        return (nettyRequest, nettyOutbound) -> {
            httpRequest.getHeaders().getHeaders().forEach(stringStringEntry -> {
                nettyRequest.addHeader(stringStringEntry.getKey(), stringStringEntry.getValue());
            });

            AsciiString mediaType = HttpHeaderValues.APPLICATION_JSON;
            if (httpRequest.getHeaders()
                    .getHeaders()
                    .stream()
                    .anyMatch(s -> s.getKey().equalsIgnoreCase(ApiHttpHeaders.CONTENT_TYPE))) {
                mediaType = AsciiString
                        .of(Objects.requireNonNull(httpRequest.getHeaders().getFirst(ApiHttpHeaders.CONTENT_TYPE)));
            }
            nettyRequest.requestHeaders().set(ApiHttpHeaders.CONTENT_TYPE, mediaType);

            final byte[] body = httpRequest.getBody();
            if (body != null) {
                return nettyOutbound.send(Mono.just(Unpooled.wrappedBuffer(body)));
            }
            return nettyOutbound;
        };
    }

    //    @NotNull
    private static BiFunction<HttpClientResponse, ByteBufMono, Mono<ApiHttpResponse<byte[]>>> toApiResponse() {
        return (response, byteBufMono) -> byteBufMono.asByteArray().defaultIfEmpty(EMPTY_BYTES).map(bytes -> {
            ApiHttpHeaders headers = new ApiHttpHeaders(response.responseHeaders().entries());
            return new ApiHttpResponse<>(response.status().code(), headers, bytes.length > 0 ? bytes : null,
                response.status().reasonPhrase());
        });
    }

    //    @Override
    //    protected void closeDelegate() throws Throwable {
    //    }
}
