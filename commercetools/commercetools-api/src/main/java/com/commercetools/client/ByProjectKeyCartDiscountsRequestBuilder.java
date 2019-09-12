package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyCartDiscountsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCartDiscountsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCartDiscountsGet get() {
      return new ByProjectKeyCartDiscountsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyCartDiscountsPost post(com.commercetools.models.CartDiscount.CartDiscountDraft cartDiscountDraft) {
      return new ByProjectKeyCartDiscountsPost(apiHttpClient, projectKey, cartDiscountDraft);
   }
   
   public ByProjectKeyCartDiscountsKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyCartDiscountsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyCartDiscountsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyCartDiscountsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
