
package com.commercetools.api.client;

import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyHead head() {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyHead(apiHttpClient, projectKey, storeKey, key);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost post(
            com.commercetools.api.models.shopping_list.ShoppingListUpdate shoppingListUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost(apiHttpClient, projectKey, storeKey, key,
            shoppingListUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPostString post(final String shoppingListUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPostString(apiHttpClient, projectKey, storeKey,
            key, shoppingListUpdate);
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyPost post(
            UnaryOperator<com.commercetools.api.models.shopping_list.ShoppingListUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.shopping_list.ShoppingListUpdateBuilder.of()).build());
    }

    public ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete(apiHttpClient, projectKey, storeKey,
            key);
    }

    public <TValue> ByProjectKeyInStoreKeyByStoreKeyShoppingListsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }

}
