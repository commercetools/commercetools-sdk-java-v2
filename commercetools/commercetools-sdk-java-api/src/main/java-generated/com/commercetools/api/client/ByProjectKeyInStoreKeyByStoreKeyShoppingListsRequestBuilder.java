
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyShoppingListsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsPost post(
            com.commercetools.api.models.shopping_list.ShoppingListDraft shoppingListDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsPost(apiHttpClient, projectKey, storeKey,
            shoppingListDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyRequestBuilder(apiHttpClient, projectKey,
            storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDRequestBuilder(apiHttpClient, projectKey, storeKey,
            ID);
    }
}
