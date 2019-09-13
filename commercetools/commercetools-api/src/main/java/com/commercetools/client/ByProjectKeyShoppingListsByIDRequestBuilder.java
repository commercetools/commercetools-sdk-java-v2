package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyShoppingListsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyShoppingListsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyShoppingListsByIDGet get() {
      return new ByProjectKeyShoppingListsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyShoppingListsByIDPost post(com.commercetools.models.shopping_list.ShoppingListUpdate shoppingListUpdate) {
      return new ByProjectKeyShoppingListsByIDPost(apiHttpClient, projectKey, ID, shoppingListUpdate);
   }
   
   public ByProjectKeyShoppingListsByIDDelete delete() {
      return new ByProjectKeyShoppingListsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
