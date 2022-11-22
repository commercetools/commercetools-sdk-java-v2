
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyLoginRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyLoginRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyLoginPost post(
            com.commercetools.api.models.customer.CustomerSignin customerSignin) {
        return new ByProjectKeyInStoreKeyByStoreKeyLoginPost(apiHttpClient, projectKey, storeKey, customerSignin);
    }

    public ByProjectKeyInStoreKeyByStoreKeyLoginPost post(
            UnaryOperator<com.commercetools.api.models.customer.CustomerSigninBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerSigninBuilder.of()).build());
    }

}
