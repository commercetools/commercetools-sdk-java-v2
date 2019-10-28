package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeyStoresKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyStoresKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyStoresKeyByKeyGet get() {
      return new ByProjectKeyStoresKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyStoresKeyByKeyPost post(com.commercetools.api.generated.models.store.StoreUpdate storeUpdate) {
      return new ByProjectKeyStoresKeyByKeyPost(apiHttpClient, projectKey, key, storeUpdate);
   }
   
   public ByProjectKeyStoresKeyByKeyDelete delete() {
      return new ByProjectKeyStoresKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
