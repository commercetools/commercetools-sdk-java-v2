
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyGet(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost post(
            com.commercetools.api.models.shopping_list.ShoppingListUpdate shoppingListUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost(apiHttpClient, projectKey, storeKey, key,
            shoppingListUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete(apiHttpClient, projectKey, storeKey,
            key);
    }

}
