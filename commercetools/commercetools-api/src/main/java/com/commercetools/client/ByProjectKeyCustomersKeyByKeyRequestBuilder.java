package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyCustomersKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyCustomersKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyCustomersKeyByKeyGet get() {
      return new ByProjectKeyCustomersKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyCustomersKeyByKeyPost post(com.commercetools.models.customer.CustomerUpdate customerUpdate) {
      return new ByProjectKeyCustomersKeyByKeyPost(apiHttpClient, projectKey, key, customerUpdate);
   }
   
   public ByProjectKeyCustomersKeyByKeyDelete delete() {
      return new ByProjectKeyCustomersKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
