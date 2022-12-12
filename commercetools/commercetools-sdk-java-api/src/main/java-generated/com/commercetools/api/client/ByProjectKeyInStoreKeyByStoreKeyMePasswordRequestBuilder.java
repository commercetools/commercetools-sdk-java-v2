
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMePasswordRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyMePasswordRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMePasswordPost post(
            com.commercetools.api.models.customer.MyCustomerChangePassword myCustomerChangePassword) {
        return new ByProjectKeyInStoreKeyByStoreKeyMePasswordPost(apiHttpClient, projectKey, storeKey,
            myCustomerChangePassword);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMePasswordPost post(
            UnaryOperator<com.commercetools.api.models.customer.MyCustomerChangePasswordBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.MyCustomerChangePasswordBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyMePasswordResetRequestBuilder reset() {
        return new ByProjectKeyInStoreKeyByStoreKeyMePasswordResetRequestBuilder(apiHttpClient, projectKey, storeKey);
    }

}
