package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyMePasswordRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMePasswordRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMePasswordPost post(com.fasterxml.jackson.databind.JsonNode jsonNode) {
      return new ByProjectKeyMePasswordPost(apiHttpClient, projectKey, jsonNode);
   }
   
   public ByProjectKeyMePasswordResetRequestBuilder reset() {
      return new ByProjectKeyMePasswordResetRequestBuilder(apiHttpClient, projectKey);
   }
}
