
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyOrdersByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyOrdersByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyOrdersByIDGet get() {
        return new ByProjectKeyOrdersByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyOrdersByIDPost post(com.commercetools.api.models.order.OrderUpdate orderUpdate) {
        return new ByProjectKeyOrdersByIDPost(apiHttpClient, projectKey, ID, orderUpdate);
    }

    public ByProjectKeyOrdersByIDPost post(UnaryOperator<com.commercetools.api.models.order.OrderUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.order.OrderUpdateBuilder.of()).build());
    }

    public ByProjectKeyOrdersByIDDelete delete() {
        return new ByProjectKeyOrdersByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyOrdersByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
