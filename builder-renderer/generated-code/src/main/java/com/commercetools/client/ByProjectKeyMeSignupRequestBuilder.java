package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyMeSignupRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMeSignupRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMeSignupPost post(com.commercetools.models.Me.MyCustomerDraft myCustomerDraft) {
      return new ByProjectKeyMeSignupPost(apiHttpClient, projectKey, myCustomerDraft);
   }
   
}
