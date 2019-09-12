package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyOrdersByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyOrdersByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyOrdersByIDGet get() {
      return new ByProjectKeyOrdersByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyOrdersByIDPost post(com.commercetools.models.Order.OrderUpdate orderUpdate) {
      return new ByProjectKeyOrdersByIDPost(apiHttpClient, projectKey, ID, orderUpdate);
   }
   
   public ByProjectKeyOrdersByIDDelete delete() {
      return new ByProjectKeyOrdersByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
