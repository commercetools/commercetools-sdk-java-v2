package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyMeActiveCartRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMeActiveCartRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMeActiveCartGet get() {
      return new ByProjectKeyMeActiveCartGet(apiHttpClient, projectKey);
   }
   
}
