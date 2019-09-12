package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyMessagesRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMessagesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMessagesGet get() {
      return new ByProjectKeyMessagesGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyMessagesByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyMessagesByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
