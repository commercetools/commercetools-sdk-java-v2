package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCategoriesByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyCategoriesByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyCategoriesByIDGet get() {
      return new ByProjectKeyCategoriesByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyCategoriesByIDPost post(com.commercetools.models.Category.CategoryUpdate categoryUpdate) {
      return new ByProjectKeyCategoriesByIDPost(apiHttpClient, projectKey, ID, categoryUpdate);
   }
   
   public ByProjectKeyCategoriesByIDDelete delete() {
      return new ByProjectKeyCategoriesByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
