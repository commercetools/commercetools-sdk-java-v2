package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
   
   public ByProjectKeyPaymentsByIDPost post(com.commercetools.api.generated.models.payment.PaymentUpdate paymentUpdate) {
      return new ByProjectKeyPaymentsByIDPost(apiHttpClient, projectKey, ID, paymentUpdate);
   }
   
   public ByProjectKeyPaymentsByIDDelete delete() {
      return new ByProjectKeyPaymentsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
