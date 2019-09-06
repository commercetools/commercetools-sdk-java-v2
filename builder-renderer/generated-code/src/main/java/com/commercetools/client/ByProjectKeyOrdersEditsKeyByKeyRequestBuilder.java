package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyOrdersEditsKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyOrdersEditsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyOrdersEditsKeyByKeyGet get() {
      return new ByProjectKeyOrdersEditsKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyOrdersEditsKeyByKeyPost post(com.commercetools.models.Common.Update update) {
      return new ByProjectKeyOrdersEditsKeyByKeyPost(apiHttpClient, projectKey, key, update);
   }
   
   public ByProjectKeyOrdersEditsKeyByKeyDelete delete() {
      return new ByProjectKeyOrdersEditsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
