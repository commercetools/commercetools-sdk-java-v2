package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyProductDiscountsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyProductDiscountsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyProductDiscountsByIDGet get() {
      return new ByProjectKeyProductDiscountsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyProductDiscountsByIDPost post(com.commercetools.api.generated.models.product_discount.ProductDiscountUpdate productDiscountUpdate) {
      return new ByProjectKeyProductDiscountsByIDPost(apiHttpClient, projectKey, ID, productDiscountUpdate);
   }
   
   public ByProjectKeyProductDiscountsByIDDelete delete() {
      return new ByProjectKeyProductDiscountsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
