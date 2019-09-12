package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

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
   
   public ByProjectKeyMeShoppingListsPost post(com.commercetools.models.Me.MyShoppingListDraft myShoppingListDraft) {
      return new ByProjectKeyMeShoppingListsPost(apiHttpClient, projectKey, myShoppingListDraft);
   }
   
   public ByProjectKeyMeShoppingListsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyMeShoppingListsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
