package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyProductDiscountsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyProductDiscountsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyProductDiscountsGet get() {
      return new ByProjectKeyProductDiscountsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyProductDiscountsPost post(com.commercetools.api.generated.models.product_discount.ProductDiscountDraft productDiscountDraft) {
      return new ByProjectKeyProductDiscountsPost(apiHttpClient, projectKey, productDiscountDraft);
   }
   
   public ByProjectKeyProductDiscountsMatchingRequestBuilder matching() {
      return new ByProjectKeyProductDiscountsMatchingRequestBuilder(apiHttpClient, projectKey);
   }
   public ByProjectKeyProductDiscountsKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyProductDiscountsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyProductDiscountsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyProductDiscountsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
