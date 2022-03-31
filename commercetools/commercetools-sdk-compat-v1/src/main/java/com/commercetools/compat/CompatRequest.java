
package com.commercetools.compat;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.sphere.sdk.client.SphereRequest;
import io.sphere.sdk.http.*;
import io.vrap.rmf.base.client.*;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

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
    protected ApiHttpRequest buildHttpRequest() {

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
            new ApiHttpHeaders(headers), Optional.ofNullable(httpRequest.getBody()).map(body -> {
                if (body instanceof StringHttpRequestBody) {
                    return ((StringHttpRequestBody) body).getString().getBytes(StandardCharsets.UTF_8);
                }
                else if (body instanceof FormUrlEncodedHttpRequestBody) {
                    return urlEncodedOf((FormUrlEncodedHttpRequestBody) body).getBytes(StandardCharsets.UTF_8);
                }
                throw new HttpException("Cannot interpret request " + httpRequest);
            }).orElse(null));
    }

    private static String urlEncodedOf(final FormUrlEncodedHttpRequestBody body) {
        return body.getParameters().stream().map(entry -> {
            try {
                return entry.getName() + "=" + URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8.toString());
            }
            catch (UnsupportedEncodingException e) {
                throw new HttpException("Cannot encode request body " + body, e);
            }
        }).collect(Collectors.joining("&"));
    }

    @Override
    public ApiHttpResponse<TResult> executeBlocking(final ApiHttpClient client, Duration timeout) {
        return blockingWait(execute(client), timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<TResult>> execute(final ApiHttpClient client) {
        return client.execute(this.createHttpRequest(), resultClass);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CompatRequest<?> request1 = (CompatRequest<?>) o;

        return new EqualsBuilder().append(request, request1.request)
                .append(resultClass, request1.resultClass)
                .append(projectKey, request1.projectKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(request).append(resultClass).append(projectKey).toHashCode();
    }
}
