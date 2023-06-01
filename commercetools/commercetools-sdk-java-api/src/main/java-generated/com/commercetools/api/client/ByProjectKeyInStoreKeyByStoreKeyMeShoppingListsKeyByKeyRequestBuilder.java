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
public class ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyRequestBuilder  {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String storeKey;
    private final String key;
    

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.storeKey = storeKey;
        this.key = key;
    }

    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyGet get() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyGet(apiHttpClient, projectKey, storeKey, key);
    }
    
    
    
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost post(com.commercetools.api.models.me.MyShoppingListUpdate myShoppingListUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost(apiHttpClient, projectKey, storeKey, key, myShoppingListUpdate);
    }
    
    
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPostString post(final String myShoppingListUpdate) {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPostString(apiHttpClient, projectKey, storeKey, key, myShoppingListUpdate);
    }
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyPost post(UnaryOperator<com.commercetools.api.models.me.MyShoppingListUpdateBuilder> op) {
        return post(op.apply(com.commercetools.api.models.me.MyShoppingListUpdateBuilder.of()).build());
    }
    
    public ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyDelete delete() {
        return new ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyDelete(apiHttpClient, projectKey, storeKey, key);
    }
    public <TValue> ByProjectKeyInStoreKeyByStoreKeyMeShoppingListsKeyByKeyDelete delete(TValue version) {
        return delete().withVersion(version);
    }
    

    
}
