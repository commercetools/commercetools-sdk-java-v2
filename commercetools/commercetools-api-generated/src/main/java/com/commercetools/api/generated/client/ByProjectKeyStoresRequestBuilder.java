package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyStoresRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyStoresRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyStoresGet get() {
      return new ByProjectKeyStoresGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyStoresPost post(com.commercetools.api.generated.models.store.StoreDraft storeDraft) {
      return new ByProjectKeyStoresPost(apiHttpClient, projectKey, storeDraft);
   }
   
   public ByProjectKeyStoresKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyStoresKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyStoresByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyStoresByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
