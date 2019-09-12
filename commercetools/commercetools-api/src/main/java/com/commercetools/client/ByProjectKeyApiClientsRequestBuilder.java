package com.commercetools.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyApiClientsRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyApiClientsRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyApiClientsGet get() {
      return new ByProjectKeyApiClientsGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyApiClientsPost post(com.commercetools.models.ApiClient.ApiClientDraft apiClientDraft) {
      return new ByProjectKeyApiClientsPost(apiHttpClient, projectKey, apiClientDraft);
   }
   
   public ByProjectKeyApiClientsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyApiClientsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
