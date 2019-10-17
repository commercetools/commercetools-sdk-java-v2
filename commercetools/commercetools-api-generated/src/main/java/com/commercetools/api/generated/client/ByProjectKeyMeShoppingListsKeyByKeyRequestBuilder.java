package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyMeShoppingListsKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyMeShoppingListsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyMeShoppingListsKeyByKeyPost post(com.commercetools.api.generated.models.me.MyShoppingListUpdate myShoppingListUpdate) {
      return new ByProjectKeyMeShoppingListsKeyByKeyPost(apiHttpClient, projectKey, key, myShoppingListUpdate);
   }
   
}
