
package com.commercetools.http.okhttp3;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import okhttp3.*;
import okhttp3.internal.http.RealResponseBody;
import okio.GzipSource;
import okio.Okio;

import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.utils.Utils;

public class CtOkHttp3Client implements VrapHttpClient, AutoCloseable {

    public static final int MAX_REQUESTS = 64;
    private final Supplier<OkHttpClient.Builder> clientBuilder = () -> new OkHttpClient.Builder().connectTimeout(120,
        TimeUnit.SECONDS).writeTimeout(120, TimeUnit.SECONDS).readTimeout(120, TimeUnit.SECONDS);

    private final OkHttpClient okHttpClient;

    public CtOkHttp3Client() {
        okHttpClient = clientBuilder.get().dispatcher(createDispatcher(MAX_REQUESTS, MAX_REQUESTS)).build();
    }

    public CtOkHttp3Client(BuilderOptions options) {
        okHttpClient = options.plus(
            clientBuilder.get().dispatcher(createDispatcher(MAX_REQUESTS, MAX_REQUESTS))).build();
    }

    public CtOkHttp3Client(Supplier<OkHttpClient.Builder> builderSupplier) {
        okHttpClient = builderSupplier.get().build();
    }

    public CtOkHttp3Client(int maxRequests, int maxRequestsPerHost) {
        Dispatcher dispatcher = createDispatcher(maxRequests, maxRequestsPerHost);
        okHttpClient = clientBuilder.get().dispatcher(dispatcher).build();
    }

    public CtOkHttp3Client(ExecutorService executor, int maxRequests, int maxRequestsPerHost) {
        okHttpClient = clientBuilder.get().dispatcher(
            createDispatcher(executor, maxRequests, maxRequestsPerHost)).build();
    }

    private Dispatcher createDispatcher(final int maxRequests, final int maxRequestsPerHost) {
        final Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequests(maxRequests);
        dispatcher.setMaxRequestsPerHost(maxRequestsPerHost);
        return dispatcher;
    }

    private Dispatcher createDispatcher(final ExecutorService executor, final int maxRequests,
            final int maxRequestsPerHost) {
        final Dispatcher dispatcher = new Dispatcher(executor);
        dispatcher.setMaxRequests(maxRequests);
        dispatcher.setMaxRequestsPerHost(maxRequestsPerHost);
        return dispatcher;
    }

    private static final String CONTENT_TYPE = "Content-Type";
    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final byte[] emptyBody = new byte[0];

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> execute(final ApiHttpRequest request) {
        return makeRequest(okHttpClient, toRequest(request)).thenApply(CtOkHttp3Client::toResponse);

    }

    private static ApiHttpResponse<byte[]> toResponse(final Response response) {
        final ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders(
            response.headers().toMultimap().entrySet().stream().flatMap(
                e -> e.getValue().stream().map(value -> ApiHttpHeaders.headerEntry(e.getKey(), value))).collect(
                    Collectors.toList()));

        final ApiHttpResponse<byte[]> apiHttpResponse = new ApiHttpResponse<>(response.code(), apiHttpHeaders,
            Optional.ofNullable(response.body()).map(Utils.wrapToCompletionException(ResponseBody::bytes)).orElse(null),
            response.message());
        if (apiHttpResponse.getBody() != null) {
            response.body().close();
        }
        return apiHttpResponse;
    }

    private static Request toRequest(final ApiHttpRequest apiHttpRequest) {

        Request.Builder httpRequestBuilder = new Request.Builder().url(apiHttpRequest.getUrl());

        //set headers
        for (Map.Entry<String, String> entry : apiHttpRequest.getHeaders().getHeaders()) {
            httpRequestBuilder = httpRequestBuilder.header(entry.getKey(), entry.getValue());
        }

        if (apiHttpRequest.getMethod() == null) {
            throw new IllegalStateException("apiHttpRequest method should be non null");
        }

        //default media type is JSON, if other media type is set as a header, use it
        MediaType mediaType = JSON;
        if (apiHttpRequest.getHeaders().getHeaders().stream().anyMatch(
            s -> s.getKey().equalsIgnoreCase(CONTENT_TYPE))) {
            mediaType = MediaType.parse(
                Objects.requireNonNull(apiHttpRequest.getHeaders().getFirst(ApiHttpHeaders.CONTENT_TYPE)));
        }

        final RequestBody body = apiHttpRequest.getBody() == null ? null
                : RequestBody.create(mediaType, apiHttpRequest.getBody());
        httpRequestBuilder.method(apiHttpRequest.getMethod().name(), body);
        return httpRequestBuilder.build();
    }

    private CompletableFuture<Response> makeRequest(final OkHttpClient client, final Request request) {
        final Call call = client.newCall(request);
        final OkHttpResponseFuture result = new OkHttpResponseFuture();
        call.enqueue(result);
        return result.future;
    }

    private static class OkHttpResponseFuture implements Callback {
        public final CompletableFuture<Response> future = new CompletableFuture<>();

        public OkHttpResponseFuture() {
        }

        @Override
        public void onFailure(final Call call, final IOException e) {
            future.completeExceptionally(e);
        }

        @Override
        public void onResponse(final Call call, final Response response) throws IOException {
            future.complete(response);
        }
    }

    @Override
    public void close() throws IOException {
        okHttpClient.dispatcher().executorService().shutdown();
        okHttpClient.connectionPool().evictAll();
        if (okHttpClient.cache() != null)
            Objects.requireNonNull(okHttpClient.cache()).close();
    }

    private static class UnzippingInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Response response = chain.proceed(chain.request());
            return unzip(response);
        }

        private Response unzip(final Response response) throws IOException {
            if (!"gzip".equalsIgnoreCase(response.header("Content-Encoding"))) {
                return response;
            }

            if (response.body() == null) {
                return response;
            }

            GzipSource responseBody = new GzipSource(response.body().source());
            Headers strippedHeaders = response.headers().newBuilder().removeAll("Content-Encoding").removeAll(
                "Content-Length").build();
            return response.newBuilder().headers(strippedHeaders).body(
                new RealResponseBody(strippedHeaders, Okio.buffer(responseBody))).build();
        }
    }
}
