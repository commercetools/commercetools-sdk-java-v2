package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCustomersPasswordTokenByPasswordTokenRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String passwordToken;
   
   
   public ByProjectKeyCustomersPasswordTokenByPasswordTokenRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String passwordToken) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.passwordToken = passwordToken;
   }
   
   public ByProjectKeyCustomersPasswordTokenByPasswordTokenGet get() {
      return new ByProjectKeyCustomersPasswordTokenByPasswordTokenGet(apiHttpClient, projectKey, passwordToken);
   }
   
}
