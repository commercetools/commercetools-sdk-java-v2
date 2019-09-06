package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCartsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyCartsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyCartsByIDGet get() {
      return new ByProjectKeyCartsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyCartsByIDPost post(com.commercetools.models.Cart.CartUpdate cartUpdate) {
      return new ByProjectKeyCartsByIDPost(apiHttpClient, projectKey, ID, cartUpdate);
   }
   
   public ByProjectKeyCartsByIDDelete delete() {
      return new ByProjectKeyCartsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
