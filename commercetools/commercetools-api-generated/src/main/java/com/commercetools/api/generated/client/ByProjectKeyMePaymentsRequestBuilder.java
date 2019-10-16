package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyMePaymentsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMePaymentsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMePaymentsGet get() {
      return new ByProjectKeyMePaymentsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyMePaymentsPost post(com.commercetools.api.generated.models.me.MyPaymentDraft myPaymentDraft) {
      return new ByProjectKeyMePaymentsPost(apiHttpClient, projectKey, myPaymentDraft);
   }
   
   public ByProjectKeyMePaymentsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyMePaymentsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
