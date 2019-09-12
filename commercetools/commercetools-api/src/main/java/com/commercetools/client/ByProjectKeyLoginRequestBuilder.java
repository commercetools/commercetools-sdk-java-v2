package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyLoginRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyLoginRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyLoginPost post(com.commercetools.models.Customer.CustomerSignin customerSignin) {
      return new ByProjectKeyLoginPost(apiHttpClient, projectKey, customerSignin);
   }
   
}
