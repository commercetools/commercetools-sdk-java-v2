
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyRequestBuilder(final ApiHttpClient apiHttpClient, final String projectKey,
            final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyCartsRequestBuilder carts() {
        return new ByProjectKeyInStoreKeyByStoreKeyCartsRequestBuilder(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyOrdersRequestBuilder orders() {
        return new ByProjectKeyInStoreKeyByStoreKeyOrdersRequestBuilder(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeRequestBuilder me() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeRequestBuilder(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyCustomersRequestBuilder customers() {
        return new ByProjectKeyInStoreKeyByStoreKeyCustomersRequestBuilder(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyLoginRequestBuilder login() {
        return new ByProjectKeyInStoreKeyByStoreKeyLoginRequestBuilder(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShippingMethodsRequestBuilder shippingMethods() {
        return new ByProjectKeyInStoreKeyByStoreKeyShippingMethodsRequestBuilder(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsRequestBuilder shoppingLists() {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsRequestBuilder(apiHttpClient, projectKey, storeKey);
    }
}
