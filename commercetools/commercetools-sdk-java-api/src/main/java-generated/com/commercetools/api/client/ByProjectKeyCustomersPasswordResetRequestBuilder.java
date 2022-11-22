
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyCustomersPasswordResetRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyCustomersPasswordResetRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyCustomersPasswordResetPost post(
            com.commercetools.api.models.customer.CustomerResetPassword customerResetPassword) {
        return new ByProjectKeyCustomersPasswordResetPost(apiHttpClient, projectKey, customerResetPassword);
    }

    public ByProjectKeyCustomersPasswordResetPost post(
            UnaryOperator<com.commercetools.api.models.customer.CustomerResetPasswordBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerResetPasswordBuilder.of()).build());
    }

}
