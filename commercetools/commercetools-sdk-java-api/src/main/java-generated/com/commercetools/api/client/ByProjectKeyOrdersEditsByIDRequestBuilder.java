
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyOrdersEditsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyOrdersEditsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyOrdersEditsByIDGet get() {
        return new ByProjectKeyOrdersEditsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyOrdersEditsByIDPost post(
            com.commercetools.api.models.order_edit.OrderEditUpdate orderEditUpdate) {
        return new ByProjectKeyOrdersEditsByIDPost(apiHttpClient, projectKey, ID, orderEditUpdate);
    }

    public ByProjectKeyOrdersEditsByIDDelete delete() {
        return new ByProjectKeyOrdersEditsByIDDelete(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyOrdersEditsByIDApplyRequestBuilder apply() {
        return new ByProjectKeyOrdersEditsByIDApplyRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
