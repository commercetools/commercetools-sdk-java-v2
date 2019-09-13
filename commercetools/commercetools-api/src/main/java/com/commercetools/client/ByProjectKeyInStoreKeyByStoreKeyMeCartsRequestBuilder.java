package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyInStoreKeyByStoreKeyMeCartsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String storeKey;
   
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.storeKey = storeKey;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsGet get() {
      return new ByProjectKeyInStoreKeyByStoreKeyMeCartsGet(apiHttpClient, projectKey, storeKey);
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsPost post(com.commercetools.models.me.MyCartDraft myCartDraft) {
      return new ByProjectKeyInStoreKeyByStoreKeyMeCartsPost(apiHttpClient, projectKey, storeKey, myCartDraft);
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyInStoreKeyByStoreKeyMeCartsByIDRequestBuilder(apiHttpClient, projectKey, storeKey, ID);
   }
}
