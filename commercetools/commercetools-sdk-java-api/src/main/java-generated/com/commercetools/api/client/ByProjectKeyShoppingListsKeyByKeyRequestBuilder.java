package com.commercetools.api.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.ApiMethod;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ByProjectKeyShoppingListsKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyShoppingListsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyShoppingListsKeyByKeyGet get() {
        return new ByProjectKeyShoppingListsKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    
    
    public ByProjectKeyShoppingListsKeyByKeyPost post(com.commercetools.api.models.shopping_list.ShoppingListUpdate shoppingListUpdate) {
        return new ByProjectKeyShoppingListsKeyByKeyPost(apiHttpClient, projectKey, key, shoppingListUpdate);
    }
    
    
    public ByProjectKeyShoppingListsKeyByKeyPostString post(final String shoppingListUpdate) {
        return new ByProjectKeyShoppingListsKeyByKeyPostString(apiHttpClient, projectKey, key, shoppingListUpdate);
    }
    public ByProjectKeyShoppingListsKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.shopping_list.ShoppingListUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.shopping_list.ShoppingListUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyShoppingListsKeyByKeyDelete delete() {
        return new ByProjectKeyShoppingListsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }
    public <TValue> ByProjectKeyShoppingListsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
