package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyCategoriesKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyCategoriesKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyCategoriesKeyByKeyGet get() {
      return new ByProjectKeyCategoriesKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyCategoriesKeyByKeyPost post(com.commercetools.models.Category.CategoryUpdate categoryUpdate) {
      return new ByProjectKeyCategoriesKeyByKeyPost(apiHttpClient, projectKey, key, categoryUpdate);
   }
   
   public ByProjectKeyCategoriesKeyByKeyDelete delete() {
      return new ByProjectKeyCategoriesKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
