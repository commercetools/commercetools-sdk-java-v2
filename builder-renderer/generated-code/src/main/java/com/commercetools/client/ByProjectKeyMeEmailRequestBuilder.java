package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyMeEmailRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMeEmailRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   
   public ByProjectKeyMeEmailConfirmRequestBuilder confirm() {
      return new ByProjectKeyMeEmailConfirmRequestBuilder(apiHttpClient, projectKey);
   }
}
