package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyProductDiscountsMatchingRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyProductDiscountsMatchingRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyProductDiscountsMatchingPost post(com.commercetools.api.generated.models.product_discount.ProductDiscountMatchQuery productDiscountMatchQuery) {
      return new ByProjectKeyProductDiscountsMatchingPost(apiHttpClient, projectKey, productDiscountMatchQuery);
   }
   
}
