package io.vrap.rmf.impl.okhttp;


import io.vrap.rmf.base.client.ApiHttpHeaders;
import io.vrap.rmf.base.client.ApiHttpRequest;
import io.vrap.rmf.base.client.ApiHttpResponse;
import io.vrap.rmf.base.client.VrapHttpClient;
import io.vrap.rmf.base.client.utils.Utils;
import okhttp3.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class VrapOkhttpClient implements VrapHttpClient {

    private final OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .connectTimeout(120,TimeUnit.SECONDS)
            .writeTimeout(120, TimeUnit.SECONDS)
            .readTimeout(120, TimeUnit.SECONDS)
            .build();
    
    private static final String CONTENT_TYPE =  "Content-Type";
    private static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    private static final byte[] emptyBody = new byte[0];

    @Override
    public CompletableFuture<ApiHttpResponse<byte[]>> execute(ApiHttpRequest request) {
        return makeRequest(okHttpClient, toRequest(request))
                .thenApply(VrapOkhttpClient::toResponse);

    }
    
    private static ApiHttpResponse<byte[]> toResponse(final Response response) {
        ApiHttpHeaders apiHttpHeaders = new ApiHttpHeaders();
        for (Map.Entry<String, List<String>> entry : response.headers().toMultimap().entrySet()) {
            apiHttpHeaders.addHeader(entry.getKey(), entry.getValue().get(0));
        }
        return new ApiHttpResponse<>(
                response.code(),
                apiHttpHeaders,
                Optional.ofNullable(response.body()).map(Utils.wrapToCompletionException(ResponseBody::bytes)).orElse(null)
        );
    }

    private static Request toRequest(final ApiHttpRequest apiHttpRequest) {

        Request.Builder httpRequestBuilder = new Request.Builder()
                .url(apiHttpRequest.fullUrl());

        //set headers
        for (Map.Entry<String, String> entry : apiHttpRequest.getHeaders().getHeaders().entrySet()) {
            httpRequestBuilder = httpRequestBuilder.header(entry.getKey(), entry.getValue());
        }

        if(apiHttpRequest.getMethod() == null){
            throw new IllegalStateException("apiHttpRequest method should be non null");
        }
        
        //default media type is JSON, if other media type is set as a header, use it
        MediaType mediaType = JSON;
        if(apiHttpRequest.getHeaders().getHeaders().keySet().stream().anyMatch(s -> s.equalsIgnoreCase(CONTENT_TYPE))){
            mediaType = MediaType.get(apiHttpRequest.getHeaders().getHeaderValue(ApiHttpHeaders.CONTENT_TYPE));
        }
        
        //set method and body
        switch (apiHttpRequest.getMethod()) {
            case GET:
                httpRequestBuilder = httpRequestBuilder.get();
                break;
            case DELETE:
                httpRequestBuilder = httpRequestBuilder.delete();
                break;
            case POST:
                httpRequestBuilder = httpRequestBuilder.post(RequestBody.create(Optional.ofNullable(apiHttpRequest.getBody()).orElse(emptyBody), mediaType));
                break;
            case PUT:
                httpRequestBuilder = httpRequestBuilder.put(RequestBody.create(Optional.ofNullable(apiHttpRequest.getBody()).orElse(emptyBody), mediaType));
                break;
            default:
                throw new RuntimeException("Non supported HTTP Method : " + apiHttpRequest.getMethod().toString());
        }
        return httpRequestBuilder.build();
    }

    private CompletableFuture<Response> makeRequest(OkHttpClient client, Request request) {
        Call call = client.newCall(request);
        OkHttpResponseFuture result = new OkHttpResponseFuture();
        call.enqueue(result);
        return result.future;
    }

    private static class OkHttpResponseFuture implements Callback {
        public final CompletableFuture<Response> future = new CompletableFuture<>();

        public OkHttpResponseFuture() {
        }

        @Override
        public void onFailure(Call call, IOException e) {
            future.completeExceptionally(e);
        }

        @Override
        public void onResponse(Call call, Response response) throws IOException {
            future.complete(response);
        }
    }
}
