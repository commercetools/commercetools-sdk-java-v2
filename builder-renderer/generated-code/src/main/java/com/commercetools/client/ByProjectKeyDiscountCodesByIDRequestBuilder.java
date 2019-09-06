package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyDiscountCodesByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyDiscountCodesByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyDiscountCodesByIDGet get() {
      return new ByProjectKeyDiscountCodesByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyDiscountCodesByIDPost post(com.commercetools.models.DiscountCode.DiscountCodeUpdate discountCodeUpdate) {
      return new ByProjectKeyDiscountCodesByIDPost(apiHttpClient, projectKey, ID, discountCodeUpdate);
   }
   
   public ByProjectKeyDiscountCodesByIDDelete delete() {
      return new ByProjectKeyDiscountCodesByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
