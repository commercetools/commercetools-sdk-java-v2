
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsRequestBuilder(final ApiHttpClient apiHttpClient,
            final String projectKey, final String storeKey) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsGet(apiHttpClient, projectKey, storeKey);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost post(
            com.commercetools.api.models.me.MyShoppingListDraft myShoppingListDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost(apiHttpClient, projectKey, storeKey,
            myShoppingListDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsPost post(
            UnaryOperator<com.commercetools.api.models.me.MyShoppingListDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyShoppingListDraftBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyRequestBuilder withKey(String key) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyRequestBuilder(apiHttpClient, projectKey,
            storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDRequestBuilder withId(String ID) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsByIDRequestBuilder(apiHttpClient, projectKey,
            storeKey, ID);
    }
}
