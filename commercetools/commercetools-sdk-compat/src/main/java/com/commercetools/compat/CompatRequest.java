
package com.commercetools.compat;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.sphere.sdk.client.SphereRequest;
import io.sphere.sdk.http.HttpRequest;
import io.sphere.sdk.json.SphereJsonUtils;
import io.vrap.rmf.base.client.*;

public class CompatRequest<TResult> extends ApiMethod<CompatRequest<TResult>, TResult>
        implements ClientRequestCommand<TResult> {

    private final SphereRequest<?> request;
    private final Class<TResult> resultClass;

    public CompatRequest(final ApiHttpClient apiHttpClient, SphereRequest<?> request, Class<TResult> resultClass) {
        super(apiHttpClient);
        this.request = request;
        this.resultClass = resultClass;
    }

    public CompatRequest(CompatRequest<TResult> t) {
        super(t);
        this.request = t.request;
        this.resultClass = t.resultClass;
    }

    public static <TResult> CompatRequest<TResult> of(ApiHttpClient client, SphereRequest<?> request,
            Class<TResult> resultClass) {
        return new CompatRequest<>(client, request, resultClass);
    }

    @Override
    protected CompatRequest<TResult> copy() {
        return new CompatRequest<>(this);
    }

    @Override
    public ApiHttpRequest createHttpRequest() {

        HttpRequest httpRequest = request.httpRequestIntent().toHttpRequest("");
        List<Map.Entry<String, String>> headers = httpRequest.getHeaders()
                .getHeadersAsMap()
                .entrySet()
                .stream()
                .flatMap(
                    e -> e.getValue().stream().map(v -> new AbstractMap.SimpleEntry<String, String>(e.getKey(), v) {
                    }))
                .collect(Collectors.toList());
        return new ApiHttpRequest(ApiHttpMethod.valueOf(httpRequest.getHttpMethod().name()),
            URI.create(httpRequest.getUrl()), new ApiHttpHeaders(headers),
            SphereJsonUtils.toJsonString(request.httpRequestIntent().getBody()).getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public ApiHttpResponse<TResult> executeBlocking(final ApiHttpClient client, Duration timeout) {
        return blockingWait(execute(client), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<TResult>> execute(final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), resultClass);
    }
}
