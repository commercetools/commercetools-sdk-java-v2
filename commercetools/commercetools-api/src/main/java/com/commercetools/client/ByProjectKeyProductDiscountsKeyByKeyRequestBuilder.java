package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyProductDiscountsKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyProductDiscountsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyProductDiscountsKeyByKeyGet get() {
      return new ByProjectKeyProductDiscountsKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyProductDiscountsKeyByKeyPost post(com.commercetools.models.ProductDiscount.ProductDiscountUpdate productDiscountUpdate) {
      return new ByProjectKeyProductDiscountsKeyByKeyPost(apiHttpClient, projectKey, key, productDiscountUpdate);
   }
   
   public ByProjectKeyProductDiscountsKeyByKeyDelete delete() {
      return new ByProjectKeyProductDiscountsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
