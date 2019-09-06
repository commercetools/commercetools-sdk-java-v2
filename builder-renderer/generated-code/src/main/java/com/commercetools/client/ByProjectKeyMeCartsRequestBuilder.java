package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyMeCartsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMeCartsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMeCartsGet get() {
      return new ByProjectKeyMeCartsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyMeCartsPost post(com.commercetools.models.Me.MyCartDraft myCartDraft) {
      return new ByProjectKeyMeCartsPost(apiHttpClient, projectKey, myCartDraft);
   }
   
   public ByProjectKeyMeCartsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyMeCartsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
