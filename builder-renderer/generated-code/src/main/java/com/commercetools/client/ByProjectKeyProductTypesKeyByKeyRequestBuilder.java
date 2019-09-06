package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyProductTypesKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyProductTypesKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyProductTypesKeyByKeyGet get() {
      return new ByProjectKeyProductTypesKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyProductTypesKeyByKeyPost post(com.commercetools.models.ProductType.ProductTypeUpdate productTypeUpdate) {
      return new ByProjectKeyProductTypesKeyByKeyPost(apiHttpClient, projectKey, key, productTypeUpdate);
   }
   
   public ByProjectKeyProductTypesKeyByKeyDelete delete() {
      return new ByProjectKeyProductTypesKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
