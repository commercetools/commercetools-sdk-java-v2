
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeEmailConfirmRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyMeEmailConfirmRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeEmailConfirmPost post(
            com.commercetools.api.models.customer.MyCustomerEmailVerify myCustomerEmailVerify) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeEmailConfirmPost(apiHttpClient, projectKey, storeKey,
            myCustomerEmailVerify);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeEmailConfirmPostString post(final String myCustomerEmailVerify) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeEmailConfirmPostString(apiHttpClient, projectKey, storeKey,
            myCustomerEmailVerify);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeEmailConfirmPost post(
            UnaryOperator<com.commercetools.api.models.customer.MyCustomerEmailVerifyBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.MyCustomerEmailVerifyBuilder.of()).build());
    }

}
