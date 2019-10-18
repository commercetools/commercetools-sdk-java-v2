package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyMeShoppingListsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMeShoppingListsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMeShoppingListsGet get() {
      return new ByProjectKeyMeShoppingListsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyMeShoppingListsPost post(com.commercetools.api.generated.models.me.MyShoppingListDraft myShoppingListDraft) {
      return new ByProjectKeyMeShoppingListsPost(apiHttpClient, projectKey, myShoppingListDraft);
   }
   
   public ByProjectKeyMeShoppingListsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyMeShoppingListsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
   public ByProjectKeyMeShoppingListsKeyByKeyRequestBuilder keyWithKeyValue(String key) {
      return new ByProjectKeyMeShoppingListsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
}
