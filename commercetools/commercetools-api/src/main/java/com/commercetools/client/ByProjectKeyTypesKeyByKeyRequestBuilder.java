package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyTypesKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyTypesKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyTypesKeyByKeyGet get() {
      return new ByProjectKeyTypesKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyTypesKeyByKeyPost post(com.commercetools.models.type.TypeUpdate typeUpdate) {
      return new ByProjectKeyTypesKeyByKeyPost(apiHttpClient, projectKey, key, typeUpdate);
   }
   
   public ByProjectKeyTypesKeyByKeyDelete delete() {
      return new ByProjectKeyTypesKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
