package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyInventoryRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyInventoryRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyInventoryGet get() {
      return new ByProjectKeyInventoryGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyInventoryPost post(com.commercetools.api.generated.models.inventory.InventoryEntryDraft inventoryEntryDraft) {
      return new ByProjectKeyInventoryPost(apiHttpClient, projectKey, inventoryEntryDraft);
   }
   
   public ByProjectKeyInventoryByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyInventoryByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
