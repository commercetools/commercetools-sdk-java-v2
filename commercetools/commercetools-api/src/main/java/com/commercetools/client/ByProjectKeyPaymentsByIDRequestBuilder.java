package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyPaymentsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyPaymentsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyPaymentsByIDGet get() {
      return new ByProjectKeyPaymentsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyPaymentsByIDPost post(com.commercetools.models.Payment.PaymentUpdate paymentUpdate) {
      return new ByProjectKeyPaymentsByIDPost(apiHttpClient, projectKey, ID, paymentUpdate);
   }
   
   public ByProjectKeyPaymentsByIDDelete delete() {
      return new ByProjectKeyPaymentsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
