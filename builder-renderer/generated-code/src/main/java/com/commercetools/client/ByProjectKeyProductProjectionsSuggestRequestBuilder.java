package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyProductProjectionsSuggestRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyProductProjectionsSuggestRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyProductProjectionsSuggestGet get() {
      return new ByProjectKeyProductProjectionsSuggestGet(apiHttpClient, projectKey);
   }
   
}
