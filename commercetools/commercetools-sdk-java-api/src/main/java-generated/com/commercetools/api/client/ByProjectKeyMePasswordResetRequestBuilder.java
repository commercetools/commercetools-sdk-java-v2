
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMePasswordResetRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMePasswordResetRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMePasswordResetPost post(
            com.commercetools.api.models.customer.MyCustomerResetPassword myCustomerResetPassword) {
        return new ByProjectKeyMePasswordResetPost(apiHttpClient, projectKey, myCustomerResetPassword);
    }

    public ByProjectKeyMePasswordResetPost post(
            UnaryOperator<com.commercetools.api.models.customer.MyCustomerResetPasswordBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.MyCustomerResetPasswordBuilder.of()).build());
    }

}
