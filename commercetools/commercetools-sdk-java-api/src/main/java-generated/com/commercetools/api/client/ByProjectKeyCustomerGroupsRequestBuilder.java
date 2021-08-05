
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")

public class ByProjectKeyCustomerGroupsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCustomerGroupsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomerGroupsGet get() {
        return new ByProjectKeyCustomerGroupsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomerGroupsPost post(
            com.commercetools.api.models.customer_group.CustomerGroupDraft customerGroupDraft) {
        return new ByProjectKeyCustomerGroupsPost(apiHttpClient, projectKey, customerGroupDraft);
    }

    public ByProjectKeyCustomerGroupsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyCustomerGroupsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyCustomerGroupsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyCustomerGroupsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }
}
