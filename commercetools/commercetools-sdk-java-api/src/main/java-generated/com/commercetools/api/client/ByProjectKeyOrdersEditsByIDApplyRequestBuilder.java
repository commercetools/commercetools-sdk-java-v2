
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyOrdersEditsByIDApplyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyOrdersEditsByIDApplyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyOrdersEditsByIDApplyPost post(
            com.commercetools.api.models.order_edit.OrderEditApply orderEditApply) {
        return new ByProjectKeyOrdersEditsByIDApplyPost(apiHttpClient, projectKey, ID, orderEditApply);
    }

    public ByProjectKeyOrdersEditsByIDApplyPost post(
            UnaryOperator<com.commercetools.api.models.order_edit.OrderEditApplyBuilder> op) {
        return post(op.apply(com.commercetools.api.models.order_edit.OrderEditApplyBuilder.of()).build());
    }

}
