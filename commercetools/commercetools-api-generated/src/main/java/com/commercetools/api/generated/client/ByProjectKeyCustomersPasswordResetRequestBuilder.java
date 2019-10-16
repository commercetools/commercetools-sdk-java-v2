package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyCustomersPasswordResetRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCustomersPasswordResetRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCustomersPasswordResetPost post(com.commercetools.api.generated.models.customer.CustomerResetPassword customerResetPassword) {
      return new ByProjectKeyCustomersPasswordResetPost(apiHttpClient, projectKey, customerResetPassword);
   }
   
}
