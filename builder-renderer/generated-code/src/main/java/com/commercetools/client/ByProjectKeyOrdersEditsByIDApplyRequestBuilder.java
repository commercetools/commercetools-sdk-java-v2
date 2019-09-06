package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyOrdersEditsByIDApplyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeyOrdersEditsByIDApplyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeyOrdersEditsByIDApplyPost post(com.commercetools.models.OrderEdit.OrderEditApply orderEditApply) {
      return new ByProjectKeyOrdersEditsByIDApplyPost(apiHttpClient, projectKey, ID, orderEditApply);
   }
   
}
