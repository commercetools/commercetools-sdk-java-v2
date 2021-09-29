
package com.commercetools.ml.client;

import static io.vrap.rmf.base.client.utils.ClientUtils.blockingWait;

import java.net.URI;
import java.net.URLConnection;
import java.nio.file.Files;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Accepts an image file and returns similar products from product catalogue.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyImageSearchPost
        extends ApiMethod<ByProjectKeyImageSearchPost, com.commercetools.ml.models.image_search.ImageSearchResponse> {

    private String projectKey;

    private java.io.File file;

    public ByProjectKeyImageSearchPost(final ApiHttpClient apiHttpClient, String projectKey, java.io.File file) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.file = file;
    }

    public ByProjectKeyImageSearchPost(ByProjectKeyImageSearchPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.file = t.file;
    }

    @Override
    public ApiHttpRequest createHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/image-search", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        try {
            ApiHttpHeaders headers = getHeaders();
            if (headers.getFirst(ApiHttpHeaders.CONTENT_TYPE) == null) {
                final String mimeType = Optional.ofNullable(URLConnection.guessContentTypeFromName(file.getName()))
                        .orElse("application/octet-stream");
                headers = headers.withHeader(ApiHttpHeaders.CONTENT_TYPE, mimeType);
            }
            return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), headers,
                Files.readAllBytes(file.toPath()));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.commercetools.ml.models.image_search.ImageSearchResponse> executeBlocking(
            final ApiHttpClient client, Duration timeout) {
        ApiHttpRequest request = this.createHttpRequest();
        return blockingWait(client.execute(request, com.commercetools.ml.models.image_search.ImageSearchResponse.class)
                .toCompletableFuture(),
            request, timeout);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.ml.models.image_search.ImageSearchResponse>> execute(
            final ApiHttpClient client) {
        return client
                .execute(this.createHttpRequest(), com.commercetools.ml.models.image_search.ImageSearchResponse.class)
                .toCompletableFuture();
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public List<String> getLimit() {
        return this.getQueryParam("limit");
    }

    public List<String> getOffset() {
        return this.getQueryParam("offset");
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * set limit with the specificied value
     */
    public ByProjectKeyImageSearchPost withLimit(final int limit) {
        return copy().withQueryParam("limit", limit);
    }

    /**
     * add additional limit query parameter
     */
    public ByProjectKeyImageSearchPost addLimit(final int limit) {
        return copy().addQueryParam("limit", limit);
    }

    /**
     * set limit with the specificied values
     */
    public ByProjectKeyImageSearchPost withLimit(final List<Integer> limit) {
        return copy().withoutQueryParam("limit")
                .addQueryParams(
                    limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional limit query parameters
     */
    public ByProjectKeyImageSearchPost addLimit(final List<Integer> limit) {
        return copy().addQueryParams(
            limit.stream().map(s -> new ParamEntry<>("limit", s.toString())).collect(Collectors.toList()));
    }

    /**
     * set offset with the specificied value
     */
    public ByProjectKeyImageSearchPost withOffset(final int offset) {
        return copy().withQueryParam("offset", offset);
    }

    /**
     * add additional offset query parameter
     */
    public ByProjectKeyImageSearchPost addOffset(final int offset) {
        return copy().addQueryParam("offset", offset);
    }

    /**
     * set offset with the specificied values
     */
    public ByProjectKeyImageSearchPost withOffset(final List<Integer> offset) {
        return copy().withoutQueryParam("offset")
                .addQueryParams(
                    offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    /**
     * add additional offset query parameters
     */
    public ByProjectKeyImageSearchPost addOffset(final List<Integer> offset) {
        return copy().addQueryParams(
            offset.stream().map(s -> new ParamEntry<>("offset", s.toString())).collect(Collectors.toList()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyImageSearchPost that = (ByProjectKeyImageSearchPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(file, that.file).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(file).toHashCode();
    }

    @Override
    protected ByProjectKeyImageSearchPost copy() {
        return new ByProjectKeyImageSearchPost(this);
    }
}
