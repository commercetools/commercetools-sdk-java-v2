package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyExtensionsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyExtensionsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyExtensionsByIDGet get() {
      return new ByProjectKeyExtensionsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyExtensionsByIDPost post(com.commercetools.models.Extension.ExtensionUpdate extensionUpdate) {
      return new ByProjectKeyExtensionsByIDPost(apiHttpClient, projectKey, ID, extensionUpdate);
   }
   
   public ByProjectKeyExtensionsByIDDelete delete() {
      return new ByProjectKeyExtensionsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
