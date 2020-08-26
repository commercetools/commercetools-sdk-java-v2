package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeShoppingListsKeyByKeyRequestBuilder {

    private final ApiHttpClient apiHttpClient;
    private final String projectKey;
    private final String key;
    

    public ByProjectKeyMeShoppingListsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
        this.apiHttpClient = apiHttpClient;
        this.projectKey = projectKey;
        this.key = key;
    }

    public ByProjectKeyMeShoppingListsKeyByKeyGet get() {
        return new ByProjectKeyMeShoppingListsKeyByKeyGet(apiHttpClient, projectKey, key);
    }
    
    public ByProjectKeyMeShoppingListsKeyByKeyPost post(com.commercetools.api.models.me.MyShoppingListUpdate myShoppingListUpdate) {
        return new ByProjectKeyMeShoppingListsKeyByKeyPost(apiHttpClient, projectKey, key, myShoppingListUpdate);
    }
    
    public ByProjectKeyMeShoppingListsKeyByKeyDelete delete() {
        return new ByProjectKeyMeShoppingListsKeyByKeyDelete(apiHttpClient, projectKey, key);
    }

}
