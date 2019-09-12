package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyShoppingListsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyShoppingListsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyShoppingListsGet get() {
      return new ByProjectKeyShoppingListsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyShoppingListsPost post(com.commercetools.models.ShoppingList.ShoppingListDraft shoppingListDraft) {
      return new ByProjectKeyShoppingListsPost(apiHttpClient, projectKey, shoppingListDraft);
   }
   
   public ByProjectKeyShoppingListsKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyShoppingListsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyShoppingListsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyShoppingListsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
