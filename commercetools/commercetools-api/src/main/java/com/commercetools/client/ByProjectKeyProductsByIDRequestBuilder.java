package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyProductsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyProductsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyProductsByIDGet get() {
      return new ByProjectKeyProductsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyProductsByIDPost post(com.commercetools.models.product.ProductUpdate productUpdate) {
      return new ByProjectKeyProductsByIDPost(apiHttpClient, projectKey, ID, productUpdate);
   }
   
   public ByProjectKeyProductsByIDDelete delete() {
      return new ByProjectKeyProductsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyProductsByIDImagesRequestBuilder images() {
      return new ByProjectKeyProductsByIDImagesRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
