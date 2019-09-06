package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyInStoreKeyByStoreKeyOrdersByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String storeKey;
   private final String ID;
   
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.storeKey = storeKey;
      this.ID = ID;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersByIDGet get() {
      return new ByProjectKeyInStoreKeyByStoreKeyOrdersByIDGet(apiHttpClient, projectKey, storeKey, ID);
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersByIDPost post(com.commercetools.models.Order.OrderUpdate orderUpdate) {
      return new ByProjectKeyInStoreKeyByStoreKeyOrdersByIDPost(apiHttpClient, projectKey, storeKey, ID, orderUpdate);
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersByIDDelete delete() {
      return new ByProjectKeyInStoreKeyByStoreKeyOrdersByIDDelete(apiHttpClient, projectKey, storeKey, ID);
   }
   
}
