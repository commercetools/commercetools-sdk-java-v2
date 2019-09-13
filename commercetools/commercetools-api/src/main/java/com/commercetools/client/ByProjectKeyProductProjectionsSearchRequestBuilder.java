package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyProductProjectionsSearchRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyProductProjectionsSearchRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyProductProjectionsSearchPost post() {
      return new ByProjectKeyProductProjectionsSearchPost(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyProductProjectionsSearchGet get() {
      return new ByProjectKeyProductProjectionsSearchGet(apiHttpClient, projectKey);
   }
   
}
