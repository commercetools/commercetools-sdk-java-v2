package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyProductTypesRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyProductTypesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyProductTypesGet get() {
      return new ByProjectKeyProductTypesGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyProductTypesPost post(com.commercetools.api.generated.models.product_type.ProductTypeDraft productTypeDraft) {
      return new ByProjectKeyProductTypesPost(apiHttpClient, projectKey, productTypeDraft);
   }
   
   public ByProjectKeyProductTypesKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyProductTypesKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyProductTypesByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyProductTypesByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
