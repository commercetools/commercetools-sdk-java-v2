package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyProductTypesByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyProductTypesByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyProductTypesByIDGet get() {
      return new ByProjectKeyProductTypesByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyProductTypesByIDPost post(com.commercetools.models.ProductType.ProductTypeUpdate productTypeUpdate) {
      return new ByProjectKeyProductTypesByIDPost(apiHttpClient, projectKey, ID, productTypeUpdate);
   }
   
   public ByProjectKeyProductTypesByIDDelete delete() {
      return new ByProjectKeyProductTypesByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
