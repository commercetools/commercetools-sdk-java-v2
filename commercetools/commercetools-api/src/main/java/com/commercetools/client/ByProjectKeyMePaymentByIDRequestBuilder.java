package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyMePaymentByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyMePaymentByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyMePaymentByIDPost post(com.commercetools.models.me.MyPaymentUpdate myPaymentUpdate) {
      return new ByProjectKeyMePaymentByIDPost(apiHttpClient, projectKey, ID, myPaymentUpdate);
   }
   
}
