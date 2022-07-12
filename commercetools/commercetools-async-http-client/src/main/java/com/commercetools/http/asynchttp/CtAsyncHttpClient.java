
package com.commercetools.http.asynchttp;

import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.function.Supplier;

import io.netty.handler.codec.http.HttpHeaderValues;
import io.netty.util.AsciiString;
import io.vrap.rmf.base.client.*;

import org.asynchttpclient.*;

public class CtAsyncHttpClient extends HttpClientBase implements VrapHttpClient, AutoCloseable {
    public static final int MAX_REQUESTS = 64;

    private final AsyncHttpClient asyncHttpClient;

    private final Supplier<DefaultAsyncHttpClientConfig.Builder> clientBuilder = CtAsyncHttpClient::createClientBuilder;

    public static DefaultAsyncHttpClientConfig.Builder createClientBuilder() {
        return new DefaultAsyncHttpClientConfig.Builder().setEnabledProtocols(new String[] { "TLSv1.1", "TLSv1.2" })
                .setReadTimeout(121000)
                .setRequestTimeout(121000)
                .setMaxConnections(MAX_REQUESTS)
                .setMaxConnectionsPerHost(MAX_REQUESTS);
    }

    public CtAsyncHttpClient() {
        super();
        asyncHttpClient = new DefaultAsyncHttpClient(clientBuilder.get().build());
    }

    public CtAsyncHttpClient(final int maxConnTotal, final int maxConnPerRoute) {
        super();
        asyncHttpClient = new DefaultAsyncHttpClient(
            clientBuilder.get().setMaxConnections(maxConnTotal).setMaxConnectionsPerHost(maxConnPerRoute).build());
    }

    public CtAsyncHttpClient(final BuilderOptions options) {
        super();
        asyncHttpClient = new DefaultAsyncHttpClient(options.plus(clientBuilder.get()).build());
    }

    public CtAsyncHttpClient(final int maxConnTotal, final int maxConnPerRoute, final BuilderOptions options) {
        super();
        asyncHttpClient = new DefaultAsyncHttpClient(
            options.plus(clientBuilder.get().setMaxConnections(maxConnTotal).setMaxConnectionsPerHost(maxConnPerRoute))
                    .build());
    }

    public CtAsyncHttpClient(final Supplier<DefaultAsyncHttpClientConfig.Builder> builderSupplier) {
        super();
        asyncHttpClient = new DefaultAsyncHttpClient(builderSupplier.get().build());
    }

    public CtAsyncHttpClient(final ExecutorService executor) {
        super(executor);
        asyncHttpClient = new DefaultAsyncHttpClient(clientBuilder.get().build());
    }

    public CtAsyncHttpClient(final ExecutorService executor, final int maxConnTotal, final int maxConnPerRoute) {
        super(executor);
        asyncHttpClient = new DefaultAsyncHttpClient(
            clientBuilder.get().setMaxConnections(maxConnTotal).setMaxConnectionsPerHost(maxConnPerRoute).build());
    }

    public CtAsyncHttpClient(final ExecutorService executor, final BuilderOptions options) {
        super(executor);
        asyncHttpClient = new DefaultAsyncHttpClient(options.plus(clientBuilder.get()).build());
    }

    public CtAsyncHttpClient(final ExecutorService executor, final int maxConnTotal, final int maxConnPerRoute,
            final BuilderOptions options) {
        super(executor);
        asyncHttpClient = new DefaultAsyncHttpClient(
            options.plus(clientBuilder.get().setMaxConnections(maxConnTotal).setMaxConnectionsPerHost(maxConnPerRoute))
                    .build());
    }

    public CtAsyncHttpClient(final ExecutorService executor,
            final Supplier<DefaultAsyncHttpClientConfig.Builder> builderSupplier) {
        super(executor);
        asyncHttpClient = new DefaultAsyncHttpClient(builderSupplier.get().build());
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> execute(final ApiHttpRequest httpRequest) {
        final Request request = asAhcRequest(httpRequest);
        final CompletableFuture<Response> future = new CompletableFuture<>();
        asyncHttpClient.executeRequest(request, new ResponseAsyncCompletionHandler(future));
        return future.thenApplyAsync(this::convert, executor());
    }

    private ApiHttpResponse<byte[]> convert(final Response response) {
        final byte[] responseBodyAsBytes = getResponseBodyAsBytes(response);
        final int statusCode = response.getStatusCode();
        final ApiHttpHeaders headers = new ApiHttpHeaders(response.getHeaders().entries());
        return new ApiHttpResponse<>(statusCode, headers, responseBodyAsBytes, response.getStatusText());
    }

    private byte[] getResponseBodyAsBytes(final Response response) {
        return response.getResponseBodyAsBytes();
    }

    private Request asAhcRequest(final ApiHttpRequest request) {
        final RequestBuilder builder = new RequestBuilder().setUrl(request.getUrl().toString())
                .setMethod(request.getMethod().toString());

        request.getHeaders().getHeaders().forEach((entry) -> builder.addHeader(entry.getKey(), entry.getValue()));

        Optional.ofNullable(request.getBody()).ifPresent(body -> {
            builder.setBody(body);
            AsciiString mediaType = HttpHeaderValues.APPLICATION_JSON;
            if (request.getHeaders()
                    .getHeaders()
                    .stream()
                    .anyMatch(s -> s.getKey().equalsIgnoreCase(ApiHttpHeaders.CONTENT_TYPE))) {
                mediaType = AsciiString
                        .of(Objects.requireNonNull(request.getHeaders().getFirst(ApiHttpHeaders.CONTENT_TYPE)));
            }
            builder.addHeader(ApiHttpHeaders.CONTENT_TYPE, mediaType);
        });
        return builder.build();
    }

    @Override
    public void closeDelegate() throws Exception {
        asyncHttpClient.close();
    }
}
