package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCustomersPasswordRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCustomersPasswordRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCustomersPasswordPost post(com.commercetools.models.Customer.CustomerChangePassword customerChangePassword) {
      return new ByProjectKeyCustomersPasswordPost(apiHttpClient, projectKey, customerChangePassword);
   }
   
   public ByProjectKeyCustomersPasswordResetRequestBuilder reset() {
      return new ByProjectKeyCustomersPasswordResetRequestBuilder(apiHttpClient, projectKey);
   }
}
