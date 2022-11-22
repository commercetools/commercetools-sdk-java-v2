
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost post(
            com.commercetools.api.models.customer.CustomerEmailVerify customerEmailVerify) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost(apiHttpClient, projectKey, storeKey,
            customerEmailVerify);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailConfirmPost post(
            UnaryOperator<com.commercetools.api.models.customer.CustomerEmailVerifyBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerEmailVerifyBuilder.of()).build());
    }

}
