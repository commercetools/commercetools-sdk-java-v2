package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyMePaymentsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyMePaymentsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyMePaymentsByIDGet get() {
      return new ByProjectKeyMePaymentsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeyMePaymentsByIDPost post(com.commercetools.api.generated.models.common.Update update) {
      return new ByProjectKeyMePaymentsByIDPost(apiHttpClient, projectKey, ID, update);
   }
   
   public ByProjectKeyMePaymentsByIDDelete delete() {
      return new ByProjectKeyMePaymentsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
