
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPost post(
            com.commercetools.api.models.customer.CustomerCreateEmailToken customerCreateEmailToken) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPost(apiHttpClient, projectKey, storeKey,
            customerCreateEmailToken);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString post(final String customerCreateEmailToken) {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPostString(apiHttpClient, projectKey, storeKey,
            customerCreateEmailToken);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersEmailTokenPost post(
            UnaryOperator<com.commercetools.api.models.customer.CustomerCreateEmailTokenBuilder> op) {
        return post(op.apply(com.commercetools.api.models.customer.CustomerCreateEmailTokenBuilder.of()).build());
    }

}
