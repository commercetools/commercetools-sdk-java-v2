
package com.commercetools.api.client;

import java.net.URI;
import java.nio.charset.StandardCharsets;
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
 *  <p>Applying an OrderEdit produces the OrderEditApplied Message.</p>
 *
 * <hr>
 * <div class=code-example>
 * <pre><code class='java'>{@code
 *   CompletableFuture<ApiHttpResponse<com.commercetools.api.models.order_edit.OrderEdit>> result = apiRoot
 *            .withProjectKey("{projectKey}")
 *            .orders()
 *            .edits()
 *            .withId("{ID}")
 *            .apply()
 *            .post("")
 *            .execute()
 * }</code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyOrdersEditsByIDApplyPostString extends
        StringBodyApiMethod<ByProjectKeyOrdersEditsByIDApplyPostString, com.commercetools.api.models.order_edit.OrderEdit>
        implements com.commercetools.api.client.ErrorableTrait<ByProjectKeyOrdersEditsByIDApplyPostString> {

    public TypeReference<com.commercetools.api.models.order_edit.OrderEdit> resultType() {
        return new TypeReference<com.commercetools.api.models.order_edit.OrderEdit>() {
        };
    }

    private String projectKey;
    private String ID;

    private String orderEditApply;

    public ByProjectKeyOrdersEditsByIDApplyPostString(final ApiHttpClient apiHttpClient, String projectKey, String ID,
            String orderEditApply) {
        super(apiHttpClient);
        this.projectKey = projectKey;
        this.ID = ID;
        this.orderEditApply = orderEditApply;
    }

    public ByProjectKeyOrdersEditsByIDApplyPostString(ByProjectKeyOrdersEditsByIDApplyPostString t) {
        super(t);
        this.projectKey = t.projectKey;
        this.ID = t.ID;
        this.orderEditApply = t.orderEditApply;
    }

    @Override
    protected ApiHttpRequest buildHttpRequest() {
        List<String> params = new ArrayList<>(getQueryParamUriStrings());
        String httpRequestPath = String.format("%s/orders/edits/%s/apply", this.projectKey, this.ID);
        if (!params.isEmpty()) {
            httpRequestPath += "?" + String.join("&", params);
        }
        return new ApiHttpRequest(ApiHttpMethod.POST, URI.create(httpRequestPath), getHeaders(),
            orderEditApply.getBytes(StandardCharsets.UTF_8));

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

    public String getBody() {
        return orderEditApply;
    }

    public ByProjectKeyOrdersEditsByIDApplyPostString withBody(String orderEditApply) {
        ByProjectKeyOrdersEditsByIDApplyPostString t = copy();
        t.orderEditApply = orderEditApply;
        return t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ByProjectKeyOrdersEditsByIDApplyPostString that = (ByProjectKeyOrdersEditsByIDApplyPostString) o;

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
    protected ByProjectKeyOrdersEditsByIDApplyPostString copy() {
        return new ByProjectKeyOrdersEditsByIDApplyPostString(this);
    }
}
