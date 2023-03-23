
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyMeLoginRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;

    public ByProjectKeyMeLoginRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
    }

    public ByProjectKeyMeLoginPost post(com.commercetools.api.models.customer.MyCustomerSignin myCustomerSignin) {
        return new ByProjectKeyMeLoginPost(apiHttpClient, projectKey, myCustomerSignin);
    }

    public ByProjectKeyMeLoginPostString post(final String myCustomerSignin) {
        return new ByProjectKeyMeLoginPostString(apiHttpClient, projectKey, myCustomerSignin);
    }

    public ByProjectKeyMeLoginPost post(
            UnaryOperator<com.commercetools.api.models.customer.MyCustomerSigninBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.MyCustomerSigninBuilder.of()).build());
    }

}
