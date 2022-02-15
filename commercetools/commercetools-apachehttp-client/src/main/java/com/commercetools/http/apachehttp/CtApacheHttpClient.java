
package com.commercetools.http.apachehttp;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.zip.GZIPInputStream;

import io.vrap.rmf.base.client.*;

import org.apache.commons.io.IOUtils;
import org.apache.commons.io.input.AutoCloseInputStream;
import org.apache.hc.client5.http.async.methods.SimpleBody;
import org.apache.hc.client5.http.async.methods.SimpleHttpResponse;
import org.apache.hc.client5.http.async.methods.SimpleResponseConsumer;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.hc.client5.http.impl.async.HttpAsyncClientBuilder;
import org.apache.hc.client5.http.impl.nio.PoolingAsyncClientConnectionManagerBuilder;
import org.apache.hc.client5.http.nio.AsyncClientConnectionManager;
import org.apache.hc.client5.http.ssl.ClientTlsStrategyBuilder;
import org.apache.hc.core5.http.ContentType;
import org.apache.hc.core5.http.Header;
import org.apache.hc.core5.http.HttpHeaders;
import org.apache.hc.core5.http.nio.AsyncRequestProducer;
import org.apache.hc.core5.http.nio.ssl.TlsStrategy;
import org.apache.hc.core5.http.nio.support.AsyncRequestBuilder;
import org.apache.hc.core5.http2.HttpVersionPolicy;
import org.apache.hc.core5.reactor.IOReactorStatus;
import org.apache.hc.core5.reactor.ssl.TlsDetails;

public class CtApacheHttpClient implements VrapHttpClient, AutoCloseable {
    public static final int MAX_REQUESTS = 64;

    private final CloseableHttpAsyncClient apacheHttpClient;

    private final Supplier<HttpAsyncClientBuilder> clientBuilder = CtApacheHttpClient::createClientBuilder;

    public static HttpAsyncClientBuilder createClientBuilder() {
        return createClientBuilder(createConnectionManager(MAX_REQUESTS, MAX_REQUESTS).build());
    }

    public static HttpAsyncClientBuilder createClientBuilder(AsyncClientConnectionManager cm) {
        return HttpAsyncClientBuilder.create().setVersionPolicy(HttpVersionPolicy.NEGOTIATE).setConnectionManager(cm);
    }

    public static PoolingAsyncClientConnectionManagerBuilder createConnectionManager(final int maxConnTotal,
            final int maxConnPerRoute) {
        final TlsStrategy tlsStrategy = ClientTlsStrategyBuilder.create()
                .useSystemProperties()
                .setTlsDetailsFactory(
                    sslEngine -> new TlsDetails(sslEngine.getSession(), sslEngine.getApplicationProtocol()))
                .build();
        return PoolingAsyncClientConnectionManagerBuilder.create()
                .setMaxConnPerRoute(maxConnPerRoute)
                .setMaxConnTotal(maxConnTotal)
                .setTlsStrategy(tlsStrategy);
    }

    public CtApacheHttpClient() {
        apacheHttpClient = clientBuilder.get().build();
        init();
    }

    public CtApacheHttpClient(final int maxConnTotal, final int maxConnPerRoute) {
        apacheHttpClient = createClientBuilder(createConnectionManager(maxConnTotal, maxConnPerRoute).build()).build();
        init();
    }

    private void init() {
        if (!(apacheHttpClient.getStatus() == IOReactorStatus.ACTIVE)) {
            apacheHttpClient.start();
        }
    }

    public CtApacheHttpClient(final BuilderOptions options) {
        apacheHttpClient = options.plus(clientBuilder.get()).build();
        init();
    }

    public CtApacheHttpClient(final int maxConnTotal, final int maxConnPerRoute, final BuilderOptions options) {
        apacheHttpClient = options
                .plus(createClientBuilder(createConnectionManager(maxConnTotal, maxConnPerRoute).build()))
                .build();
        init();
    }

    public CtApacheHttpClient(final Supplier<HttpAsyncClientBuilder> builderSupplier) {
        apacheHttpClient = builderSupplier.get().build();
        init();
    }

    private AsyncRequestProducer toApacheRequest(final ApiHttpRequest httpRequest) {
        final String method = httpRequest.getMethod().toString();
        final AsyncRequestBuilder builder = AsyncRequestBuilder.create(method);
        builder.setUri(httpRequest.getUri());
        httpRequest.getHeaders().getHeaders().forEach((entry) -> builder.addHeader(entry.getKey(), entry.getValue()));

        if (httpRequest.getBody() != null) {
            //default media type is JSON, if other media type is set as a header, use it
            ContentType mediaType = ContentType.APPLICATION_JSON.withCharset(StandardCharsets.UTF_8);
            if (httpRequest.getHeaders()
                    .getHeaders()
                    .stream()
                    .anyMatch(s -> s.getKey().equalsIgnoreCase(ApiHttpHeaders.CONTENT_TYPE))) {
                mediaType = ContentType
                        .parse(Objects.requireNonNull(httpRequest.getHeaders().getFirst(ApiHttpHeaders.CONTENT_TYPE)));
            }

            builder.setEntity(httpRequest.getBody(), mediaType);
        }
        return builder.build();
    }

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
        final CompletableFuture<SimpleHttpResponse> apacheResponseFuture = new CompletableFuture<>();
        apacheHttpClient.execute(toApacheRequest(request), SimpleResponseConsumer.create(),
            new CompletableFutureCallbackAdapter<>(apacheResponseFuture));
        return apacheResponseFuture.thenApply(CtApacheHttpClient::toResponse);
    }

    private static ApiHttpResponse<byte[]> toResponse(final SimpleHttpResponse response) {
        final Map<String, List<Header>> apacheHeaders = Arrays.stream(response.getHeaders())
                .collect(Collectors.groupingBy(Header::getName));

        final ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders(apacheHeaders.entrySet()
                .stream()
                .flatMap(
                    e -> e.getValue().stream().map(value -> ApiHttpHeaders.headerEntry(e.getKey(), value.getValue())))
                .collect(Collectors.toList()));

        final byte[] bodyNullable = Optional.ofNullable(response.getBody()).map((SimpleBody entity) -> {
            try {
                final boolean gzipEncoded = Optional.ofNullable(response.getFirstHeader(HttpHeaders.CONTENT_ENCODING))
                        .map(Header::getValue)
                        .map(v -> v.equalsIgnoreCase("gzip"))
                        .orElse(false);
                final InputStream body = new ByteArrayInputStream(entity.getBodyBytes());
                final InputStream content = gzipEncoded ? new GZIPInputStream(body) : body;
                final AutoCloseInputStream autoCloseInputStream = new AutoCloseInputStream(content);
                return IOUtils.toByteArray(autoCloseInputStream);
            }
            catch (final IOException e) {
                throw new HttpException(e);
            }
        }).orElse(null);

        return new ApiHttpResponse<>(response.getCode(), apiHttpHeaders, bodyNullable, response.getReasonPhrase());
    }

    @Override
    public void close() throws Exception {
        apacheHttpClient.close();
    }
}
