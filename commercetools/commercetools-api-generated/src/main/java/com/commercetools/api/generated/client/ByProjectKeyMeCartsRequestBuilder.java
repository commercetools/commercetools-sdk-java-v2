package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

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
   
   public ByProjectKeyMeCartsPost post(com.commercetools.api.generated.models.me.MyCartDraft myCartDraft) {
      return new ByProjectKeyMeCartsPost(apiHttpClient, projectKey, myCartDraft);
   }
   
   public ByProjectKeyMeCartsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyMeCartsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
