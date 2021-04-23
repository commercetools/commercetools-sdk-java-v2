
package com.commercetools.compat;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
    private final String projectKey;

    private CompatRequest(final ApiHttpClient apiHttpClient, final String projectKey, SphereRequest<?> request,
            final Class<TResult> resultClass) {
        super(apiHttpClient);
        this.request = request;
        this.projectKey = projectKey;
        this.resultClass = resultClass;
    }

    private CompatRequest(CompatRequest<TResult> t) {
        super(t);
        this.request = t.request;
        this.resultClass = t.resultClass;
        this.projectKey = t.projectKey;
    }

    public static <TResult> CompatRequest<TResult> of(final ApiHttpClient client, final String projectKey,
            final SphereRequest<?> request, final Class<TResult> resultClass) {
        return new CompatRequest<>(client, projectKey, request, resultClass);
    }

    @Override
    protected CompatRequest<TResult> copy() {
        return new CompatRequest<>(this);
    }

    @Override
    public ApiHttpRequest createHttpRequest() {

        HttpRequest httpRequest = request.httpRequestIntent().toHttpRequest("/" + projectKey);
        List<Map.Entry<String, String>> headers = httpRequest.getHeaders()
                .getHeadersAsMap()
                .entrySet()
                .stream()
                .flatMap(
                    e -> e.getValue().stream().map(v -> new AbstractMap.SimpleEntry<String, String>(e.getKey(), v) {
                    }))
                .collect(Collectors.toList());

        final URI resolve = URI.create(httpRequest.getUrl());
        return new ApiHttpRequest(ApiHttpMethod.valueOf(httpRequest.getHttpMethod().name()), resolve,
            new ApiHttpHeaders(headers),
            Optional.ofNullable(httpRequest.getBody())
                    .map(body -> SphereJsonUtils.toJsonString(body).getBytes(StandardCharsets.UTF_8))
                    .orElse(null));
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
