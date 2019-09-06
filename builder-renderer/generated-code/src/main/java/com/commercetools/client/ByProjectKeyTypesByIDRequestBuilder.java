package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyTypesByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyTypesByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyTypesByIDGet get() {
      return new ByProjectKeyTypesByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyTypesByIDPost post(com.commercetools.models.Type.TypeUpdate typeUpdate) {
      return new ByProjectKeyTypesByIDPost(apiHttpClient, projectKey, ID, typeUpdate);
   }
   
   public ByProjectKeyTypesByIDDelete delete() {
      return new ByProjectKeyTypesByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
