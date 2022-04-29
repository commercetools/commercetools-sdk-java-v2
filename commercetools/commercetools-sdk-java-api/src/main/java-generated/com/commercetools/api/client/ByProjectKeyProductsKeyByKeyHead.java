
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Checks if product with given key exists.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyProductsKeyByKeyHead
        extends ApiMethod<ByProjectKeyProductsKeyByKeyHead, com.fasterxml.jackson.databind.JsonNode>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyProductsKeyByKeyHead>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyProductsKeyByKeyHead> {

    private String projectKey;
    private String key;

    public ByProjectKeyProductsKeyByKeyHead(final ApiHttpClient apiHttpClient, String projectKey, String key) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyProductsKeyByKeyHead(ByProjectKeyProductsKeyByKeyHead t) {
        super(t);
        this.projectKey = t.projectKey;
        this.key = t.key;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/products/key=%s", this.projectKey, this.key);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.HEAD, URI.create(httpRequestPath), getHeaders(), null);
    }

    @Override
    public ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.fasterxml.jackson.databind.JsonNode.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> execute(
            final ApiHttpClient client) {
        return execute(client, com.fasterxml.jackson.databind.JsonNode.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getKey() {
        return this.key;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyProductsKeyByKeyHead that = (ByProjectKeyProductsKeyByKeyHead) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(key, that.key).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(key).toHashCode();
    }

    @Override
    protected ByProjectKeyProductsKeyByKeyHead copy() {
        return new ByProjectKeyProductsKeyByKeyHead(this);
    }
}
