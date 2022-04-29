
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrdersEditsByIDApplyPost extends
        BodyApiMethod<ByProjectKeyOrdersEditsByIDApplyPost, com.commercetools.api.models.order_edit.OrderEdit, com.commercetools.api.models.order_edit.OrderEditApply>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersEditsByIDApplyPost> {

    private String projectKey;
    private String ID;

    private com.commercetools.api.models.order_edit.OrderEditApply orderEditApply;

    public ByProjectKeyOrdersEditsByIDApplyPost(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            com.commercetools.api.models.order_edit.OrderEditApply orderEditApply) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.orderEditApply = orderEditApply;
    }

    public ByProjectKeyOrdersEditsByIDApplyPost(ByProjectKeyOrdersEditsByIDApplyPost t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.orderEditApply = t.orderEditApply;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("/%s/orders/edits/%s/apply", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            io.vrap.rmf.base.client.utils.json.JsonUtils
                    .executing(() -> apiHttpClient().getSerializerService().toJsonByteArray(orderEditApply)));

    }

    @Override
    public ApiHttpResponse<com.commercetools.api.models.order_edit.OrderEdit> executeBlocking(
            final ApiHttpClient client, final Duration timeout) {
        return executeBlocking(client, timeout, com.commercetools.api.models.order_edit.OrderEdit.class);
    }

    @Override
    public CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order_edit.OrderEdit>> execute(
            final ApiHttpClient client) {
        return execute(client, com.commercetools.api.models.order_edit.OrderEdit.class);
    }

    public String getProjectKey() {
        return this.projectKey;
    }

    public String getID() {
        return this.ID;
    }

    public void setProjectKey(final String projectKey) {
        this.projectKey = projectKey;
    }

    public void setID(final String ID) {
        this.ID = ID;
    }

    public com.commercetools.api.models.order_edit.OrderEditApply getBody() {
        return orderEditApply;
    }

    public ByProjectKeyOrdersEditsByIDApplyPost withBody(
            com.commercetools.api.models.order_edit.OrderEditApply orderEditApply) {
        ByProjectKeyOrdersEditsByIDApplyPost t = copy();
        t.orderEditApply = orderEditApply;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyOrdersEditsByIDApplyPost that = (ByProjectKeyOrdersEditsByIDApplyPost) o;

        return new EqualsBuilder().append(projectKey, that.projectKey)
                .append(ID, that.ID)
                .append(orderEditApply, that.orderEditApply)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(projectKey).append(ID).append(orderEditApply).toHashCode();
    }

    @Override
    protected ByProjectKeyOrdersEditsByIDApplyPost copy() {
        return new ByProjectKeyOrdersEditsByIDApplyPost(this);
    }
}
