
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyGet(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost post(
            com.commercetools.api.models.me.MyShoppingListUpdate myShoppingListUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost(apiHttpClient, projectKey, storeKey, key,
            myShoppingListUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyDelete(apiHttpClient, projectKey, storeKey,
            key);
    }

}
