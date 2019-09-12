package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyStoresByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyStoresByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyStoresByIDGet get() {
      return new ByProjectKeyStoresByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyStoresByIDPost post(com.commercetools.models.Store.StoreUpdate storeUpdate) {
      return new ByProjectKeyStoresByIDPost(apiHttpClient, projectKey, ID, storeUpdate);
   }
   
   public ByProjectKeyStoresByIDDelete delete() {
      return new ByProjectKeyStoresByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
