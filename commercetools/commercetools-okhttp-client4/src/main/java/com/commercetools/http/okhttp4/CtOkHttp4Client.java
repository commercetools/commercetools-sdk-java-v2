
package com.commercetools.http.okhttp4;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import javax.validation.constraints.NotNull;

import okhttp3.OkHttpClient;
import okio.GzipSource;
import okio.Okio;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Utils;

public class CtOkHttp4Client extends HttpClientBase {

    public static final int MAX_REQUESTS = 64;
    private final Supplier<OkHttpClient.Builder> clientBuilder = () -> new OkHttpClient.Builder()
            .connectTimeout(120, TimeUnit.SECONDS)
            .writeTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .protocols(Collections.singletonList(okhttp3.Protocol.HTTP_1_1))
            .addInterceptor(new UnzippingInterceptor());

    private final OkHttpClient okHttpClient;

    public CtOkHttp4Client() {
        okHttpClient = clientBuilder.get().dispatcher(createDispatcher(MAX_REQUESTS, MAX_REQUESTS)).build();
    }

    public CtOkHttp4Client(final BuilderOptions options) {
        okHttpClient = options.plus(clientBuilder.get().dispatcher(createDispatcher(MAX_REQUESTS, MAX_REQUESTS)))
                .build();
    }

    public CtOkHttp4Client(final Supplier<OkHttpClient.Builder> builderSupplier) {
        okHttpClient = builderSupplier.get().build();
    }

    public CtOkHttp4Client(final int maxRequests, final int maxRequestsPerHost) {
        okHttpClient = clientBuilder.get().dispatcher(createDispatcher(maxRequests, maxRequestsPerHost)).build();
    }

    public CtOkHttp4Client(final int maxRequests, final int maxRequestsPerHost, final BuilderOptions options) {
        okHttpClient = options.plus(clientBuilder.get().dispatcher(createDispatcher(maxRequests, maxRequestsPerHost)))
                .build();
    }

    public CtOkHttp4Client(final ExecutorService executor, final int maxRequests, final int maxRequestsPerHost) {
        okHttpClient = clientBuilder.get()
                .dispatcher(createDispatcher(executor, maxRequests, maxRequestsPerHost))
                .build();
    }

    public CtOkHttp4Client(final ExecutorService executor, final int maxRequests, final int maxRequestsPerHost,
            final BuilderOptions options) {
        okHttpClient = options
                .plus(clientBuilder.get().dispatcher(createDispatcher(executor, maxRequests, maxRequestsPerHost)))
                .build();
    }

    public okhttp3.Dispatcher createDispatcher(final int maxRequests, final int maxRequestsPerHost) {
        final okhttp3.Dispatcher dispatcher = new okhttp3.Dispatcher();
        dispatcher.setMaxRequests(maxRequests);
        dispatcher.setMaxRequestsPerHost(maxRequestsPerHost);
        return dispatcher;
    }

    public okhttp3.Dispatcher createDispatcher(final ExecutorService executor, final int maxRequests,
            final int maxRequestsPerHost) {
        final okhttp3.Dispatcher dispatcher = new okhttp3.Dispatcher(executor);
        dispatcher.setMaxRequests(maxRequests);
        dispatcher.setMaxRequestsPerHost(maxRequestsPerHost);
        return dispatcher;
    }

    private static final String CONTENT_TYPE = "Content-Type";
    private static final okhttp3.MediaType JSON = okhttp3.MediaType.get("application/json; charset=utf-8");
    private static final byte[] emptyBody = new byte[0];

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> execute(final ApiHttpRequest request) {
        return makeRequest(okHttpClient, toRequest(request)).thenApplyAsync(CtOkHttp4Client::toResponse, executor());

    }

    private static ApiHttpResponse<byte[]> toResponse(final okhttp3.Response response) {
        final ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders(response.headers()
                .toMultimap()
                .entrySet()
                .stream()
                .flatMap(e -> e.getValue().stream().map(value -> ApiHttpHeaders.headerEntry(e.getKey(), value)))
                .collect(Collectors.toList()));

        final ApiHttpResponse<byte[]> apiHttpResponse = new ApiHttpResponse<>(response.code(), apiHttpHeaders,
            Optional.ofNullable(response.body())
                    .map(Utils.wrapToCompletionException(okhttp3.ResponseBody::bytes))
                    .orElse(null),
            response.message());
        if (apiHttpResponse.getBody() != null) {
            response.close();
        }
        return apiHttpResponse;
    }

    private static okhttp3.Request toRequest(final ApiHttpRequest apiHttpRequest) {

        okhttp3.Request.Builder httpRequestBuilder = new okhttp3.Request.Builder().url(apiHttpRequest.getUrl());

        //set headers
        for (Map.Entry<String, String> entry : apiHttpRequest.getHeaders().getHeaders()) {
            httpRequestBuilder = httpRequestBuilder.header(entry.getKey(), entry.getValue());
        }

        if (apiHttpRequest.getMethod() == null) {
            throw new IllegalStateException("apiHttpRequest method should be non null");
        }

        //default media type is JSON, if other media type is set as a header, use it
        okhttp3.MediaType mediaType = JSON;
        if (apiHttpRequest.getHeaders()
                .getHeaders()
                .stream()
                .anyMatch(s -> s.getKey().equalsIgnoreCase(CONTENT_TYPE))) {
            mediaType = okhttp3.MediaType
                    .get(Objects.requireNonNull(apiHttpRequest.getHeaders().getFirst(ApiHttpHeaders.CONTENT_TYPE)));
        }

        try {
            final okhttp3.RequestBody body = apiHttpRequest.getBody() == null ? null
                    : okhttp3.RequestBody.create(apiHttpRequest.getBody(), mediaType);
            httpRequestBuilder.method(apiHttpRequest.getMethod().name(), body);
        }
        catch (NoSuchMethodError error) {
            throw new IllegalStateException(
                "Request class is not compatible with this HTTP client implementation. Probably a wrong http client package is used. Please try \"commercetools-okhttp-client3\" instead");
        }
        return httpRequestBuilder.build();
    }

    private CompletableFuture<okhttp3.Response> makeRequest(final OkHttpClient client, final okhttp3.Request request) {
        final okhttp3.Call call = client.newCall(request);
        final OkHttpResponseFuture result = new OkHttpResponseFuture();
        call.enqueue(result);
        return result.future;
    }

    private static class OkHttpResponseFuture implements okhttp3.Callback {
        public final CompletableFuture<okhttp3.Response> future = new CompletableFuture<>();

        public OkHttpResponseFuture() {
        }

        @Override
        public void onFailure(final okhttp3.Call call, final IOException e) {
            future.completeExceptionally(e);
        }

        @Override
        public void onResponse(final okhttp3.Call call, final okhttp3.Response response) throws IOException {
            future.complete(response);
        }
    }

    @Override
    public void closeDelegate() throws IOException {
        okHttpClient.dispatcher().executorService().shutdown();
        okHttpClient.connectionPool().evictAll();
        if (okHttpClient.cache() != null)
            Objects.requireNonNull(okHttpClient.cache()).close();
    }

    public static class UnzippingInterceptor implements okhttp3.Interceptor {
        @Override
        @NotNull
        public okhttp3.Response intercept(Chain chain) throws IOException {
            okhttp3.Response response = chain.proceed(chain.request());
            return unzip(response);
        }

        private okhttp3.Response unzip(final okhttp3.Response response) throws IOException {
            if (!"gzip".equalsIgnoreCase(response.header("Content-Encoding"))) {
                return response;
            }

            okhttp3.ResponseBody responseBody = response.body();
            if (responseBody == null) {
                return response;
            }

            GzipSource gzipSource = new GzipSource(responseBody.source());
            okhttp3.Headers strippedHeaders = response.headers()
                    .newBuilder()
                    .removeAll("Content-Encoding")
                    .removeAll("Content-Length")
                    .build();
            String contentType = response.header("Content-Type");
            return response.newBuilder()
                    .headers(strippedHeaders)
                    .body(okhttp3.ResponseBody.create(Okio.buffer(gzipSource), okhttp3.MediaType.get(contentType), -1L))
                    .build();
        }
    }
}
