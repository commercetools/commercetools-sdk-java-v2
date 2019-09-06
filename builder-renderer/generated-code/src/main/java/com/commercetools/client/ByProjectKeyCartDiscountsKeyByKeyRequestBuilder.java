package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCartDiscountsKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyCartDiscountsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyCartDiscountsKeyByKeyGet get() {
      return new ByProjectKeyCartDiscountsKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyCartDiscountsKeyByKeyPost post(com.commercetools.models.CartDiscount.CartDiscountUpdate cartDiscountUpdate) {
      return new ByProjectKeyCartDiscountsKeyByKeyPost(apiHttpClient, projectKey, key, cartDiscountUpdate);
   }
   
   public ByProjectKeyCartDiscountsKeyByKeyDelete delete() {
      return new ByProjectKeyCartDiscountsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
