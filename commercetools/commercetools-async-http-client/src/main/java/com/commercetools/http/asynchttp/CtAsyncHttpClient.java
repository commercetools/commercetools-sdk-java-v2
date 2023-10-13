
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
import org.asynchttpclient.filter.ThrottleRequestFilter;

public class CtAsyncHttpClient extends HttpClientBase implements VrapHttpClient, AutoCloseable {
    public static final int MAX_REQUESTS = 64;

    private final AsyncHttpClient asyncHttpClient;

    private final Supplier<DefaultAsyncHttpClientConfig.Builder> clientBuilder = CtAsyncHttpClient::createClientBuilder;

    public static DefaultAsyncHttpClientConfig.Builder createClientBuilder() {
        return new DefaultAsyncHttpClientConfig.Builder().setEnabledProtocols(new String[] { "TLSv1.1", "TLSv1.2" })
                .setReadTimeout(121000)
                .setRequestTimeout(121000);
    }

    /**
     * Uses a {@link ThrottleRequestFilter} to limit the number of concurrent requests
     */
    public CtAsyncHttpClient() {
        super();
        asyncHttpClient = new DefaultAsyncHttpClient(
            clientBuilder.get().addRequestFilter(new ThrottleRequestFilter(MAX_REQUESTS)).build());
    }

    /**
     * Uses a {@link ThrottleRequestFilter} to limit the number of concurrent requests
     * @param maxConnections maximum number of parallel connections
     */
    public CtAsyncHttpClient(final int maxConnections) {
        super();
        asyncHttpClient = new DefaultAsyncHttpClient(
            clientBuilder.get().addRequestFilter(new ThrottleRequestFilter(maxConnections)).build());
    }

    /**
     * creates a default instance of the AsyncHttpClient
     * @param options options to build the underlying HTTP client
     */
    public CtAsyncHttpClient(final BuilderOptions options) {
        super();
        asyncHttpClient = new DefaultAsyncHttpClient(options.plus(clientBuilder.get()).build());
    }

    /**
     * Uses a {@link ThrottleRequestFilter} to limit the number of concurrent requests
     * @param maxConnections maximum number of parallel connections
     * @param options options to build the underlying HTTP client
     */
    public CtAsyncHttpClient(final int maxConnections, final BuilderOptions options) {
        super();
        asyncHttpClient = new DefaultAsyncHttpClient(
            options.plus(clientBuilder.get().addRequestFilter(new ThrottleRequestFilter(maxConnections))).build());
    }

    /**
     * creates a instance of the AsyncHttpClient using the provided builder
     * @param builderSupplier builder with the configuration of the underlying HTTP client
     */
    public CtAsyncHttpClient(final Supplier<DefaultAsyncHttpClientConfig.Builder> builderSupplier) {
        super();
        asyncHttpClient = new DefaultAsyncHttpClient(builderSupplier.get().build());
    }

    /**
     * creates a default instance of the AsyncHttpClient
     * @param executor ExecutorService to be used for the client
     */
    public CtAsyncHttpClient(final ExecutorService executor) {
        super(executor);
        asyncHttpClient = new DefaultAsyncHttpClient(clientBuilder.get().build());
    }

    /**
     * Uses a {@link ThrottleRequestFilter} to limit the number of concurrent requests
     * @param maxConnections maximum number of parallel connections
     * @param executor ExecutorService to be used
     */
    public CtAsyncHttpClient(final ExecutorService executor, final int maxConnections) {
        super(executor);
        asyncHttpClient = new DefaultAsyncHttpClient(
            clientBuilder.get().addRequestFilter(new ThrottleRequestFilter(maxConnections)).build());
    }

    /**
     * creates a default instance of the AsyncHttpClient
     * @param executor ExecutorService to be used for the client
     * @param options options to build the underlying HTTP client
     */
    public CtAsyncHttpClient(final ExecutorService executor, final BuilderOptions options) {
        super(executor);
        asyncHttpClient = new DefaultAsyncHttpClient(options.plus(clientBuilder.get()).build());
    }

    /**
     * Uses a {@link ThrottleRequestFilter} to limit the number of concurrent requests
     * @param maxConnections maximum number of parallel connections
     * @param executor ExecutorService to be used
     * @param options options to build the underlying HTTP client
     */
    public CtAsyncHttpClient(final ExecutorService executor, final int maxConnections, final BuilderOptions options) {
        super(executor);
        asyncHttpClient = new DefaultAsyncHttpClient(
            options.plus(clientBuilder.get().addRequestFilter(new ThrottleRequestFilter(maxConnections))).build());
    }

    /**
     * creates a instance of the AsyncHttpClient using the provided builder
     * @param executor ExecutorService to be used
     * @param builderSupplier builder with the configuration of the underlying HTTP client
     */
    public CtAsyncHttpClient(final ExecutorService executor,
            final Supplier<DefaultAsyncHttpClientConfig.Builder> builderSupplier) {
        super(executor);
        asyncHttpClient = new DefaultAsyncHttpClient(builderSupplier.get().build());
    }

    /**
     * executes a request
     * @param httpRequest request to be executed
     * @return response future
     */
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

    /**
     * closes the underlying HTTP client
     * @throws Exception in case of failure closing the client
     */
    @Override
    public void closeDelegate() throws Exception {
        asyncHttpClient.close();
    }
}
