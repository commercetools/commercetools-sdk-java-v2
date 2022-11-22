
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomerGroupsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;

    public ByProjectKeyCustomerGroupsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyCustomerGroupsKeyByKeyGet get() {
        return new ByProjectKeyCustomerGroupsKeyByKeyGet(apiHttpClient, projectKey, key);
    }

    public ByProjectKeyCustomerGroupsKeyByKeyPost post(
            com.commercetools.api.models.customer_group.CustomerGroupUpdate customerGroupUpdate) {
        return new ByProjectKeyCustomerGroupsKeyByKeyPost(apiHttpClient, projectKey, key, customerGroupUpdate);
    }

    public ByProjectKeyCustomerGroupsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.customer_group.CustomerGroupUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer_group.CustomerGroupUpdateBuilder.of()).build());
    }

    public ByProjectKeyCustomerGroupsKeyByKeyDelete delete() {
        return new ByProjectKeyCustomerGroupsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

    public <TValue> ByProjectKeyCustomerGroupsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
