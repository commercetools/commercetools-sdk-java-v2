package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyCustomObjectsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyCustomObjectsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyCustomObjectsByIDGet get() {
      return new ByProjectKeyCustomObjectsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyCustomObjectsByIDDelete delete() {
      return new ByProjectKeyCustomObjectsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
