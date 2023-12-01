
package com.commercetools.api.client;

import java.net.URI;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import com.fasterxml.jackson.core.type.TypeReference;

import io.vrap.rmf.base.client.*;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Checks if a Cart of a Customer exists. Returns a <code>200 OK</code> status if the Cart exists or a <code>404 Not Found</code> otherwise.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.fasterxml.jackson.databind.JsonNode>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .carts()
 *            .withCustomerId("{customerId}")
 *            .head()
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCartsCustomerIdByCustomerIdHead
        extends TypeApiMethod<ByProjectKeyCartsCustomerIdByCustomerIdHead, com.fasterxml.jackson.databind.JsonNode>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyCartsCustomerIdByCustomerIdHead>,
        com.commercetools.api.client.Deprecatable200Trait<ByProjectKeyCartsCustomerIdByCustomerIdHead> {

    @Override
    public TypeReference<com.fasterxml.jackson.databind.JsonNode> resultType() {
        return new TypeReference<com.fasterxml.jackson.databind.JsonNode>() {
        };
    }

    private String projectKey;
    private String customerId;

    public ByProjectKeyCartsCustomerIdByCustomerIdHead(final ApiHttpClient apiHttpClient, String projectKey,
            String customerId) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.customerId = customerId;
    }

    public ByProjectKeyCartsCustomerIdByCustomerIdHead(ByProjectKeyCartsCustomerIdByCustomerIdHead t) {
        super(t);
        this.projectKey = t.projectKey;
        this.customerId = t.customerId;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/carts/customer-id=%s", this.projectKey, this.customerId);
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

    public String getCustomerId() {
        return this.customerId;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyCartsCustomerIdByCustomerIdHead that = (ByProjectKeyCartsCustomerIdByCustomerIdHead) o;

        return new EqualsBuilder().append(projectKey, that.projectKey).append(customerId, that.customerId).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(customerId).toHashCode();
    }

    @Override
    protected ByProjectKeyCartsCustomerIdByCustomerIdHead copy() {
        return new ByProjectKeyCartsCustomerIdByCustomerIdHead(this);
    }
}
