
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
*  <p>Create an Order by Import</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrdersImportPost extends
        BodyApiMethod<ByProjectKeyOrdersImportPost, com.commercetools.api.models.order.Order, com.commercetools.api.models.order.OrderImportDraft>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersImportPost> {

    private String projectKey;

    private com.commercetools.api.models.order.OrderImportDraft orderImportDraft;

    public ByProjectKeyOrdersImportPost(final ApiHttpClient apiHttpClient, String projectKey,
            com.commercetools.api.models.order.OrderImportDraft orderImportDraft) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.orderImportDraft = orderImportDraft;
    }

    public ByProjectKeyOrdersImportPost(ByProjectKeyOrdersImportPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.orderImportDraft = t.orderImportDraft;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders/import", this.projectKey);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(orderImportDraft)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order.Order> executeBlocking(final ApiHttpClient client,
            final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.order.Order.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order.Order>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.order.Order.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public com.commercetools.api.models.order.OrderImportDraft getBody() {
        return orderImportDraft;
    }

    public ByProjectKeyOrdersImportPost withBody(com.commercetools.api.models.order.OrderImportDraft orderImportDraft) {
        ByProjectKeyOrdersImportPost t = copy();
        t.orderImportDraft = orderImportDraft;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyOrdersImportPost that = (ByProjectKeyOrdersImportPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(orderImportDraft, that.orderImportDraft)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(orderImportDraft).toHashCode();
    }

    @Override
    protected ByProjectKeyOrdersImportPost copy() {
        return new ByProjectKeyOrdersImportPost(this);
    }
}
