
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyCartsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyCartsRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsPost post(com.commercetools.api.models.cart.CartDraft cartDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsPost(apiHttpClient, projectKey, storeKey, cartDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdRequestBuilder withCustomerId(String customerId) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsCustomerIdByCustomerIdRequestBuilder(apiHttpClient, projectKey,
            storeKey, customerId);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsKeyByKeyRequestBuilder(apiHttpClient, projectKey, storeKey,
            key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsReplicateRequestBuilder replicate() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsReplicateRequestBuilder(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsByIDRequestBuilder(apiHttpClient, projectKey, storeKey, ID);
    }
}
