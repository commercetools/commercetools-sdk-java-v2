
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersEmailConfirmRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCustomersEmailConfirmRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomersEmailConfirmPost post(
            com.commercetools.api.models.customer.CustomerEmailVerify customerEmailVerify) {
        return new ByProjectKeyCustomersEmailConfirmPost(apiHttpClient, projectKey, customerEmailVerify);
    }

    public ByProjectKeyCustomersEmailConfirmPostString post(final String customerEmailVerify) {
        return new ByProjectKeyCustomersEmailConfirmPostString(apiHttpClient, projectKey, customerEmailVerify);
    }

    public ByProjectKeyCustomersEmailConfirmPost post(
            UnaryOperator<com.commercetools.api.models.customer.CustomerEmailVerifyBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerEmailVerifyBuilder.of()).build());
    }

}
