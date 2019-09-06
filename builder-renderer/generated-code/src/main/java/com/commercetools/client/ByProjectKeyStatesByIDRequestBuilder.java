package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyStatesByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyStatesByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyStatesByIDGet get() {
      return new ByProjectKeyStatesByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyStatesByIDPost post(com.commercetools.models.State.StateUpdate stateUpdate) {
      return new ByProjectKeyStatesByIDPost(apiHttpClient, projectKey, ID, stateUpdate);
   }
   
   public ByProjectKeyStatesByIDDelete delete() {
      return new ByProjectKeyStatesByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
