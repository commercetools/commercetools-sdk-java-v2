package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
   
   public ByProjectKeyShoppingListsPost post(com.commercetools.api.generated.models.shopping_list.ShoppingListDraft shoppingListDraft) {
      return new ByProjectKeyShoppingListsPost(apiHttpClient, projectKey, shoppingListDraft);
   }
   
   public ByProjectKeyShoppingListsKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyShoppingListsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyShoppingListsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyShoppingListsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
