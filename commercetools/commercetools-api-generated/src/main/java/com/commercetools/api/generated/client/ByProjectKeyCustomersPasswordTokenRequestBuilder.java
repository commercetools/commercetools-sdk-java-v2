package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyCustomersPasswordTokenRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCustomersPasswordTokenRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCustomersPasswordTokenPost post(com.commercetools.api.generated.models.customer.CustomerCreatePasswordResetToken customerCreatePasswordResetToken) {
      return new ByProjectKeyCustomersPasswordTokenPost(apiHttpClient, projectKey, customerCreatePasswordResetToken);
   }
   
}
