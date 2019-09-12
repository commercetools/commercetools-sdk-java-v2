package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyInStoreKeyByStoreKeyOrdersRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String storeKey;
   
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String storeKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.storeKey = storeKey;
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersGet get() {
      return new ByProjectKeyInStoreKeyByStoreKeyOrdersGet(apiHttpClient, projectKey, storeKey);
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersPost post(com.commercetools.models.Order.OrderFromCartDraft orderFromCartDraft) {
      return new ByProjectKeyInStoreKeyByStoreKeyOrdersPost(apiHttpClient, projectKey, storeKey, orderFromCartDraft);
   }
   
   public ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberRequestBuilder withOrderNumber(String orderNumber) {
      return new ByProjectKeyInStoreKeyByStoreKeyOrdersOrderNumberByOrderNumberRequestBuilder(apiHttpClient, projectKey, storeKey, orderNumber);
   }
   public ByProjectKeyInStoreKeyByStoreKeyOrdersByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyInStoreKeyByStoreKeyOrdersByIDRequestBuilder(apiHttpClient, projectKey, storeKey, ID);
   }
}
