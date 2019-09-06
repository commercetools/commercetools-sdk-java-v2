package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCustomersPasswordTokenRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCustomersPasswordTokenRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCustomersPasswordTokenPost post(com.commercetools.models.Customer.CustomerCreatePasswordResetToken customerCreatePasswordResetToken) {
      return new ByProjectKeyCustomersPasswordTokenPost(apiHttpClient, projectKey, customerCreatePasswordResetToken);
   }
   
}
