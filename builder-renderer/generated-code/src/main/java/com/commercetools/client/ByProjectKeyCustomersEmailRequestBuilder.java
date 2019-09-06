package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCustomersEmailRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCustomersEmailRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   
   public ByProjectKeyCustomersEmailConfirmRequestBuilder confirm() {
      return new ByProjectKeyCustomersEmailConfirmRequestBuilder(apiHttpClient, projectKey);
   }
}
