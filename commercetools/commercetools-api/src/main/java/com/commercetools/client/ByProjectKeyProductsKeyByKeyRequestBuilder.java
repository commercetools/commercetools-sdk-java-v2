package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyProductsKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyProductsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyProductsKeyByKeyGet get() {
      return new ByProjectKeyProductsKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyProductsKeyByKeyPost post(com.commercetools.models.Product.ProductUpdate productUpdate) {
      return new ByProjectKeyProductsKeyByKeyPost(apiHttpClient, projectKey, key, productUpdate);
   }
   
   public ByProjectKeyProductsKeyByKeyDelete delete() {
      return new ByProjectKeyProductsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
