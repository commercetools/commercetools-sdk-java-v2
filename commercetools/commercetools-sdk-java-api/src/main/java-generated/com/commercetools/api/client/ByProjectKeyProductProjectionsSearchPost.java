
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Search Product Projection</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductProjectionsSearchPost extends
        ApiMethod<ByProjectKeyProductProjectionsSearchPost, com.commercetools.api.models.product.ProductProjectionPagedSearchResponse>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductProjectionsSearchPost> {

    private String projectKey;

    private List<ParamEntry<String, String>> formParams;

    public ByProjectKeyProductProjectionsSearchPost(final ApiHttpClient apiHttpClient, String projectKey,
            List<ParamEntry<String, String>> formParams) {
        super(apiHttpClient,
            new ApiHttpHeaders(
                new ApiHttpHeaders.StringHeaderEntry(ApiHttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded")),
            new ArrayList<>());
        this.projectKey = projectKey;
        this.formParams = formParams != null ? formParams : new ArrayList<>();
    }

    public ByProjectKeyProductProjectionsSearchPost(ByProjectKeyProductProjectionsSearchPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.formParams = new ArrayList<>(t.formParams);
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/product-projections/search", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            getFormParamUriString().getBytes(StandardCharsets.UTF_8));
    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedSearchResponse> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout,
            com.commercetools.api.models.product.ProductProjectionPagedSearchResponse.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.product.ProductProjectionPagedSearchResponse>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.product.ProductProjectionPagedSearchResponse.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    /**
     * add an additional form parameter
     * @param key form parameter name
     * @param value form parameter value
     * @param <V> value type
     * @return T
     */
    public <V> ByProjectKeyProductProjectionsSearchPost addFormParam(final String key, final V value) {
        ByProjectKeyProductProjectionsSearchPost c = copy();
        c.formParams.add(new ParamEntry<>(key, value.toString()));
        return c;
    }

    /**
     * set the form parameter with the specified value
     * @param key form parameter name
     * @param value form parameter value
     * @param <V> value type
     * @return T
     */
    public <V> ByProjectKeyProductProjectionsSearchPost withFormParam(final String key, final V value) {
        return withoutFormParam(key).addFormParam(key, value);
    }

    /**
     * removes the specified form parameter
     * @param key form parameter name
     * @return T
     */
    public ByProjectKeyProductProjectionsSearchPost withoutFormParam(final String key) {
        ByProjectKeyProductProjectionsSearchPost c = copy();
        c.formParams = c.formParams.stream()
                .filter(e -> !e.getKey().equalsIgnoreCase(key))
                .collect(Collectors.toList());
        return c;
    }

    /**
     * set the form parameters
     * @param formParams list of form parameters
     * @return T
     */
    public ByProjectKeyProductProjectionsSearchPost withFormParams(final List<ParamEntry<String, String>> formParams) {
        ByProjectKeyProductProjectionsSearchPost c = copy();
        c.formParams = formParams;
        return c;
    }

    public List<ParamEntry<String, String>> getFormParams() {
        return new ArrayList<>(this.formParams);
    }

    public List<String> getFormParam(final String key) {
        return this.formParams.stream()
                .filter(e -> e.getKey().equals(key))
                .map(ParamEntry::getValue)
                .collect(Collectors.toList());
    }

    public List<String> getFormParamUriStrings() {
        return this.formParams.stream().map(ParamEntry::toUriString).collect(Collectors.toList());
    }

    public String getFormParamUriString() {
        return this.formParams.stream().map(ParamEntry::toUriString).collect(Collectors.joining("&"));
    }

    @Nullable
    public String getFirstFormParam(final String key) {
        return this.formParams.stream()
                .filter(e -> e.getKey().equals(key))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductProjectionsSearchPost that = (ByProjectKeyProductProjectionsSearchPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(formParams, that.formParams).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(formParams).toHashCode();
    }

    @Override
    protected ByProjectKeyProductProjectionsSearchPost copy() {
        return new ByProjectKeyProductProjectionsSearchPost(this);
    }
}
