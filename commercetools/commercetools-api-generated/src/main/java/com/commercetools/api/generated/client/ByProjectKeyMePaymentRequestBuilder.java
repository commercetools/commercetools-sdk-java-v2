package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyMePaymentRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMePaymentRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   
   public ByProjectKeyMePaymentKeyByKeyRequestBuilder keyWithKeyValue(String key) {
      return new ByProjectKeyMePaymentKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyMePaymentByIDRequestBuilder withIDValue(String ID) {
      return new ByProjectKeyMePaymentByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
