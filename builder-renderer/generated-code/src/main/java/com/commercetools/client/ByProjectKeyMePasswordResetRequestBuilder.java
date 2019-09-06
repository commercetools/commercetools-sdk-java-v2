package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyMePasswordResetRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMePasswordResetRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMePasswordResetPost post() {
      return new ByProjectKeyMePasswordResetPost(apiHttpClient, projectKey);
   }
   
}
