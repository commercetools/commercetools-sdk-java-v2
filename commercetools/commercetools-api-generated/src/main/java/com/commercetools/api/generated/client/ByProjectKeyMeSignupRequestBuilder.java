package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyMeSignupRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMeSignupRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMeSignupPost post(com.commercetools.api.generated.models.me.MyCustomerDraft myCustomerDraft) {
      return new ByProjectKeyMeSignupPost(apiHttpClient, projectKey, myCustomerDraft);
   }
   
}
