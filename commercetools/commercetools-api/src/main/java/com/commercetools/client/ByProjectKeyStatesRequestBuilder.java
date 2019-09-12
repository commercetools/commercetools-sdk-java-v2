package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyStatesRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyStatesRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyStatesGet get() {
      return new ByProjectKeyStatesGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyStatesPost post(com.commercetools.models.State.StateDraft stateDraft) {
      return new ByProjectKeyStatesPost(apiHttpClient, projectKey, stateDraft);
   }
   
   public ByProjectKeyStatesByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyStatesByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
