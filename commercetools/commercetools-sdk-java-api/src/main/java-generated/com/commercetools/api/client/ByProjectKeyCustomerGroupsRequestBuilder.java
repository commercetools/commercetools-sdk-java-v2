
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomerGroupsRequestBuilder implements ByProjectKeyCustomerGroupsRequestBuilderMixin {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCustomerGroupsRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomerGroupsGet get() {
        return new ByProjectKeyCustomerGroupsGet(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomerGroupsHead head() {
        return new ByProjectKeyCustomerGroupsHead(apiHttpClient, projectKey);
    }

    public ByProjectKeyCustomerGroupsPost post(
            com.commercetools.api.models.customer_group.CustomerGroupDraft customerGroupDraft) {
        return new ByProjectKeyCustomerGroupsPost(apiHttpClient, projectKey, customerGroupDraft);
    }

    public ByProjectKeyCustomerGroupsPostString post(final String customerGroupDraft) {
        return new ByProjectKeyCustomerGroupsPostString(apiHttpClient, projectKey, customerGroupDraft);
    }

    public ByProjectKeyCustomerGroupsPost post(
            UnaryOperator<com.commercetools.api.models.customer_group.CustomerGroupDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer_group.CustomerGroupDraftBuilder.of()).build());
    }

    public ByProjectKeyCustomerGroupsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyCustomerGroupsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyCustomerGroupsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyCustomerGroupsByIDRequestBuilder(apiHttpClient, projectKey, ID);
    }

}
