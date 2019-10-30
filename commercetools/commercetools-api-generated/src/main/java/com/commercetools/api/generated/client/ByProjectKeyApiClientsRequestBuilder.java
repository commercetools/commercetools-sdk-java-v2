package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
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
   
   public ByProjectKeyApiClientsPost post(com.commercetools.api.generated.models.api_client.ApiClientDraft apiClientDraft) {
      return new ByProjectKeyApiClientsPost(apiHttpClient, projectKey, apiClientDraft);
   }
   
   public ByProjectKeyApiClientsByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyApiClientsByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
