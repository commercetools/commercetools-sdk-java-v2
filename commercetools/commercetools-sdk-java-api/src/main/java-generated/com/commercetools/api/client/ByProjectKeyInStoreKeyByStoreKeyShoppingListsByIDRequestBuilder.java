
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost post(
            com.commercetools.api.models.shopping_list.ShoppingListUpdate shoppingListUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDPost(apiHttpClient, projectKey, storeKey, ID,
            shoppingListUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

}
