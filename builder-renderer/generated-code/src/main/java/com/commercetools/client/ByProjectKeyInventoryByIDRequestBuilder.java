package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyInventoryByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyInventoryByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyInventoryByIDGet get() {
      return new ByProjectKeyInventoryByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyInventoryByIDPost post(com.commercetools.models.Inventory.InventoryEntryUpdate inventoryEntryUpdate) {
      return new ByProjectKeyInventoryByIDPost(apiHttpClient, projectKey, ID, inventoryEntryUpdate);
   }
   
   public ByProjectKeyInventoryByIDDelete delete() {
      return new ByProjectKeyInventoryByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
