package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyInStoreKeyByStoreKeyCartsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String storeKey;
   
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.storeKey = storeKey;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsGet get() {
      return new ByProjectKeyInStoreKeyByStoreKeyCartsGet(apiHttpClient, projectKey, storeKey);
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsPost post(com.commercetools.models.cart.CartDraft cartDraft) {
      return new ByProjectKeyInStoreKeyByStoreKeyCartsPost(apiHttpClient, projectKey, storeKey, cartDraft);
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyCartsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyInStoreKeyByStoreKeyCartsByIDRequestBuilder(apiHttpClient, projectKey, storeKey, ID);
   }
}
