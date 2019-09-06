package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCustomersEmailTokenByEmailTokenRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String emailToken;
   
   
   public ByProjectKeyCustomersEmailTokenByEmailTokenRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String emailToken) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.emailToken = emailToken;
   }
   
   public ByProjectKeyCustomersEmailTokenByEmailTokenGet get() {
      return new ByProjectKeyCustomersEmailTokenByEmailTokenGet(apiHttpClient, projectKey, emailToken);
   }
   
}
