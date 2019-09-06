package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyPaymentsKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeyPaymentsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeyPaymentsKeyByKeyGet get() {
      return new ByProjectKeyPaymentsKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeyPaymentsKeyByKeyPost post(com.commercetools.models.Payment.PaymentUpdate paymentUpdate) {
      return new ByProjectKeyPaymentsKeyByKeyPost(apiHttpClient, projectKey, key, paymentUpdate);
   }
   
   public ByProjectKeyPaymentsKeyByKeyDelete delete() {
      return new ByProjectKeyPaymentsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
