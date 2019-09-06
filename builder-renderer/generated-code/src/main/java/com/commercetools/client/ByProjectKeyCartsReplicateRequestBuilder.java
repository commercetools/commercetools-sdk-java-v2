package com.commercetools.client;
import client.ApiHttpClient;

public class ByProjectKeyCartsReplicateRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyCartsReplicateRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyCartsReplicatePost post(com.commercetools.models.Cart.ReplicaCartDraft replicaCartDraft) {
      return new ByProjectKeyCartsReplicatePost(apiHttpClient, projectKey, replicaCartDraft);
   }
   
}
