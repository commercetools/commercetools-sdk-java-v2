
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordResetRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordResetRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordResetPost post(
            com.commercetools.api.models.customer.CustomerResetPassword customerResetPassword) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordResetPost(apiHttpClient, projectKey, storeKey,
            customerResetPassword);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersPasswordResetPost post(
            UnaryOperator<com.commercetools.api.models.customer.CustomerResetPasswordBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerResetPasswordBuilder.of()).build());
    }

}
