package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyGraphqlRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyGraphqlRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyGraphqlPost post(com.fasterxml.jackson.databind.JsonNode jsonNode) {
      return new ByProjectKeyGraphqlPost(apiHttpClient, projectKey, jsonNode);
   }
   
}
