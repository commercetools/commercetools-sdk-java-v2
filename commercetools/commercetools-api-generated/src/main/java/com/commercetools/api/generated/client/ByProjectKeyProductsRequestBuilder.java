package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyProductsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyProductsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyProductsGet get() {
      return new ByProjectKeyProductsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyProductsPost post(com.commercetools.api.generated.models.product.ProductDraft productDraft) {
      return new ByProjectKeyProductsPost(apiHttpClient, projectKey, productDraft);
   }
   
   public ByProjectKeyProductsKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyProductsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyProductsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyProductsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
