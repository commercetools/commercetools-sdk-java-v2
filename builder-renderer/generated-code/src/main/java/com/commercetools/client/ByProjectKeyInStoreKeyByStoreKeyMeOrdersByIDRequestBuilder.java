package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyInStoreKeyByStoreKeyMeOrdersByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String storeKey;
   private final String ID;
   
   
   public ByProjectKeyInStoreKeyByStoreKeyMeOrdersByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.storeKey = storeKey;
      this.ID = ID;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeOrdersByIDGet get() {
      return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersByIDGet(apiHttpClient, projectKey, storeKey, ID);
   }
   
}
