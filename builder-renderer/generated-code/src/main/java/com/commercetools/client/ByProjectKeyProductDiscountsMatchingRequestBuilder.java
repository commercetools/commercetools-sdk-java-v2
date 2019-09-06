package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyProductDiscountsMatchingRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyProductDiscountsMatchingRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyProductDiscountsMatchingPost post(com.commercetools.models.ProductDiscount.ProductDiscountMatchQuery productDiscountMatchQuery) {
      return new ByProjectKeyProductDiscountsMatchingPost(apiHttpClient, projectKey, productDiscountMatchQuery);
   }
   
}
