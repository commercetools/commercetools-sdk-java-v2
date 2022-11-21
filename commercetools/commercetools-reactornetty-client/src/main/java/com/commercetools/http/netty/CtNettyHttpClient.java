
package com.commercetools.http.netty;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.validation.constraints.NotNull;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelOption;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.resolver.DefaultAddressResolverGroup;
import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.HttpClientBase;

import org.reactivestreams.Publisher;

import reactor.core.publisher.Mono;
import reactor.netty.ByteBufMono;
import reactor.netty.NettyOutbound;
import reactor.netty.http.client.HttpClient;
import reactor.netty.http.client.HttpClientRequest;
import reactor.netty.http.client.HttpClientResponse;
import reactor.netty.resources.ConnectionProvider;

public class CtNettyHttpClient extends HttpClientBase {

    public static final int MAX_REQUESTS = 64;
    private static final byte[] EMPTY_BYTES = new byte[0];

    private final HttpClient nettyClient;
    private final Supplier<HttpClient> clientSupplier = CtNettyHttpClient::createDefaultClient;

    public CtNettyHttpClient() {
        super();
        this.nettyClient = clientSupplier.get();
        this.nettyClient.warmup();
    }

    public CtNettyHttpClient(final BuilderOptions options) {
        super();
        this.nettyClient = options.plus(clientSupplier.get());
        this.nettyClient.warmup();
    }

    public CtNettyHttpClient(final Supplier<HttpClient> httpClientSupplier) {
        super();
        this.nettyClient = httpClientSupplier.get();
        this.nettyClient.warmup();
    }

    public CtNettyHttpClient(final ExecutorService executor) {
        super(executor);
        this.nettyClient = clientSupplier.get();
        this.nettyClient.warmup();
    }

    public CtNettyHttpClient(final ExecutorService executor, final BuilderOptions options) {
        super(executor);
        this.nettyClient = options.plus(clientSupplier.get());
        this.nettyClient.warmup();
    }

    public CtNettyHttpClient(final ExecutorService executor, final Supplier<HttpClient> httpClientSupplier) {
        super(executor);
        this.nettyClient = httpClientSupplier.get();
        this.nettyClient.warmup();
    }

    public static HttpClient createDefaultClient() {
        return HttpClient.create(ConnectionProvider.create("commercetools", MAX_REQUESTS))
                .secure()
                .compress(true)
                .resolver(DefaultAddressResolverGroup.INSTANCE)
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 10000);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
        final HttpMethod method = HttpMethod.valueOf(request.getMethod().name());
        return nettyClient.request(method)
                .uri(request.getUri())
                .send(toNettyRequest(request))
                .responseSingle(toApiResponse())
                .toFuture()
                .thenApplyAsync(Function.identity(), executor());
    }

    private static BiFunction<HttpClientRequest, NettyOutbound, Publisher<Void>> toNettyRequest(
            final ApiHttpRequest httpRequest) {
        return (nettyRequest, nettyOutbound) -> {
            httpRequest.getHeaders().getHeaders().forEach(stringStringEntry -> {
                nettyRequest.addHeader(stringStringEntry.getKey(), stringStringEntry.getValue());
            });
            final byte[] body = httpRequest.getBody();
            if (body != null) {
                return nettyOutbound.send(Mono.just(Unpooled.wrappedBuffer(body)));
            }
            return nettyOutbound;
        };
    }

    @NotNull
    private static BiFunction<HttpClientResponse, ByteBufMono, Mono<ApiHttpResponse<byte[]>>> toApiResponse() {
        return (response, byteBufMono) -> byteBufMono.asByteArray().defaultIfEmpty(EMPTY_BYTES).map(bytes -> {
            ApiHttpHeaders headers = new ApiHttpHeaders(response.responseHeaders().entries());
            return new ApiHttpResponse<>(response.status().code(), headers, bytes.length > 0 ? bytes : null,
                response.status().reasonPhrase());
        });
    }

    @Override
    protected void closeDelegate() throws Throwable {
    }
}
