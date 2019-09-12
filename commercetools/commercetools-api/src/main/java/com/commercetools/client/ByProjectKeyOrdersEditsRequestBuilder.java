package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyOrdersEditsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyOrdersEditsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyOrdersEditsGet get() {
      return new ByProjectKeyOrdersEditsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyOrdersEditsPost post(com.commercetools.models.OrderEdit.OrderEditDraft orderEditDraft) {
      return new ByProjectKeyOrdersEditsPost(apiHttpClient, projectKey, orderEditDraft);
   }
   
   public ByProjectKeyOrdersEditsKeyByKeyRequestBuilder withKey(String key) {
      return new ByProjectKeyOrdersEditsKeyByKeyRequestBuilder(apiHttpClient, projectKey, key);
   }
   public ByProjectKeyOrdersEditsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyOrdersEditsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
