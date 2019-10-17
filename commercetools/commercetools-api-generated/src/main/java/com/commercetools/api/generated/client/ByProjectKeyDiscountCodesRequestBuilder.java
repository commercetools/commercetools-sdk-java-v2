package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyDiscountCodesRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyDiscountCodesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyDiscountCodesGet get() {
      return new ByProjectKeyDiscountCodesGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyDiscountCodesPost post(com.commercetools.api.generated.models.discount_code.DiscountCodeDraft discountCodeDraft) {
      return new ByProjectKeyDiscountCodesPost(apiHttpClient, projectKey, discountCodeDraft);
   }
   
   public ByProjectKeyDiscountCodesByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyDiscountCodesByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
