package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyMeEmailConfirmRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMeEmailConfirmRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMeEmailConfirmPost post() {
      return new ByProjectKeyMeEmailConfirmPost(apiHttpClient, projectKey);
   }
   
}
