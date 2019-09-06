package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyGraphqlRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyGraphqlRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyGraphqlPost post(java.lang.Object object) {
      return new ByProjectKeyGraphqlPost(apiHttpClient, projectKey, object);
   }
   
}
