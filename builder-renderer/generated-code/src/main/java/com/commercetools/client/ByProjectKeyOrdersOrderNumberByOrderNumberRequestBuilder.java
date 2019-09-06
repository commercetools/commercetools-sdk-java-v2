package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyOrdersOrderNumberByOrderNumberRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String orderNumber;
   
   
   public ByProjectKeyOrdersOrderNumberByOrderNumberRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String orderNumber) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.orderNumber = orderNumber;
   }
   
   public ByProjectKeyOrdersOrderNumberByOrderNumberGet get() {
      return new ByProjectKeyOrdersOrderNumberByOrderNumberGet(apiHttpClient, projectKey, orderNumber);
   }
   
   public ByProjectKeyOrdersOrderNumberByOrderNumberPost post(com.commercetools.models.Order.OrderUpdate orderUpdate) {
      return new ByProjectKeyOrdersOrderNumberByOrderNumberPost(apiHttpClient, projectKey, orderNumber, orderUpdate);
   }
   
   public ByProjectKeyOrdersOrderNumberByOrderNumberDelete delete() {
      return new ByProjectKeyOrdersOrderNumberByOrderNumberDelete(apiHttpClient, projectKey, orderNumber);
   }
   
}
