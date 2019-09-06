package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyMeLoginRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMeLoginRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMeLoginPost post(com.fasterxml.jackson.databind.JsonNode jsonNode) {
      return new ByProjectKeyMeLoginPost(apiHttpClient, projectKey, jsonNode);
   }
   
}
