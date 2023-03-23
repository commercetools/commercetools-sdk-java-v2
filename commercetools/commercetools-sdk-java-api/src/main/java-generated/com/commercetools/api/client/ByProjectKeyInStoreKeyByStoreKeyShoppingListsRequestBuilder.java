
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ByProjectKeyInStoreKeyByStoreKeyShoppingListsRequestBuilder
        implements ByProjectKeyInStoreKeyByStoreKeyShoppingListsRequestMixin {

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

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsPostString post(final String shoppingListDraft) {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsPostString(apiHttpClient, projectKey, storeKey,
            shoppingListDraft);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsPost post(
            UnaryOperator<com.commercetools.api.models.shopping_list.ShoppingListDraftBuilder> op) {
        return post(op.apply(com.commercetools.api.models.shopping_list.ShoppingListDraftBuilder.of()).build());
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
