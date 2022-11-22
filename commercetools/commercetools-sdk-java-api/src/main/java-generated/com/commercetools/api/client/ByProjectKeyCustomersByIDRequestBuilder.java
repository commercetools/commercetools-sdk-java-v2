
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String ID;

    public ByProjectKeyCustomersByIDRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.ID = ID;
    }

    public ByProjectKeyCustomersByIDGet get() {
        return new ByProjectKeyCustomersByIDGet(apiHttpClient, projectKey, ID);
    }

    public ByProjectKeyCustomersByIDPost post(com.commercetools.api.models.customer.CustomerUpdate customerUpdate) {
        return new ByProjectKeyCustomersByIDPost(apiHttpClient, projectKey, ID, customerUpdate);
    }

    public ByProjectKeyCustomersByIDPost post(
            UnaryOperator<com.commercetools.api.models.customer.CustomerUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerUpdateBuilder.of()).build());
    }

    public ByProjectKeyCustomersByIDDelete delete() {
        return new ByProjectKeyCustomersByIDDelete(apiHttpClient, projectKey, ID);
    }

    public <TValue> ByProjectKeyCustomersByIDDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
