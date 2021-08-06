
package com.commercetools.api.client;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String ID;

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey, final String ID) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.ID = ID;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDGet(apiHttpClient, projectKey, storeKey, ID);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDPost post(
            com.commercetools.api.models.me.MyShoppingListUpdate myShoppingListUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDPost(apiHttpClient, projectKey, storeKey, ID,
            myShoppingListUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDDelete(apiHttpClient, projectKey, storeKey, ID);
    }

}
