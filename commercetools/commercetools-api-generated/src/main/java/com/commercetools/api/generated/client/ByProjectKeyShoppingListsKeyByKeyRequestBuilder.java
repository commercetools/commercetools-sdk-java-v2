package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyShoppingListsKeyByKeyRequestBuilder {
   
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
   
   public ByProjectKeyShoppingListsKeyByKeyPost post(com.commercetools.api.generated.models.shopping_list.ShoppingListUpdate shoppingListUpdate) {
      return new ByProjectKeyShoppingListsKeyByKeyPost(apiHttpClient, projectKey, key, shoppingListUpdate);
   }
   
   public ByProjectKeyShoppingListsKeyByKeyDelete delete() {
      return new ByProjectKeyShoppingListsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
