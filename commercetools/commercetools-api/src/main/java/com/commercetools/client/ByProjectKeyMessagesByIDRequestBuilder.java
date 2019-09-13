package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyMessagesByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyMessagesByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyMessagesByIDGet get() {
      return new ByProjectKeyMessagesByIDGet(apiHttpClient, projectKey, ID);
   }
   
}
