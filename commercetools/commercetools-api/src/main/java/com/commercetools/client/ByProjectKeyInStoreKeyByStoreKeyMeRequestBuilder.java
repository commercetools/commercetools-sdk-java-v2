package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyInStoreKeyByStoreKeyMeRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String storeKey;
   
   
   public ByProjectKeyInStoreKeyByStoreKeyMeRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.storeKey = storeKey;
   }
   
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsRequestBuilder carts() {
      return new ByProjectKeyInStoreKeyByStoreKeyMeCartsRequestBuilder(apiHttpClient, projectKey, storeKey);
   }
   public ByProjectKeyInStoreKeyByStoreKeyMeOrdersRequestBuilder orders() {
      return new ByProjectKeyInStoreKeyByStoreKeyMeOrdersRequestBuilder(apiHttpClient, projectKey, storeKey);
   }
   public ByProjectKeyInStoreKeyByStoreKeyMeActiveCartRequestBuilder activeCart() {
      return new ByProjectKeyInStoreKeyByStoreKeyMeActiveCartRequestBuilder(apiHttpClient, projectKey, storeKey);
   }
}
