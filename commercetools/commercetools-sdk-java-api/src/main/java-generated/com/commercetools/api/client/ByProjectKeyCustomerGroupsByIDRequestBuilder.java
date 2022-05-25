
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomerGroupsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyCustomerGroupsByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyCustomerGroupsByIDGet get() {
        return new ByProjectKeyCustomerGroupsByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyCustomerGroupsByIDPost post(
            com.commercetools.api.models.customer_group.CustomerGroupUpdate customerGroupUpdate) {
        return new ByProjectKeyCustomerGroupsByIDPost(apiHttpClient, projectKey, ID, customerGroupUpdate);
    }

    public ByProjectKeyCustomerGroupsByIDDelete delete() {
        return new ByProjectKeyCustomerGroupsByIDDelete(apiHttpClient, projectKey, ID);
    }

}
