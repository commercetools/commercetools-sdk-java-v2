package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeyMeOrdersRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   
   
   public ByProjectKeyMeOrdersRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
   }
   
   public ByProjectKeyMeOrdersGet get() {
      return new ByProjectKeyMeOrdersGet(apiHttpClient, projectKey);
   }
   
   public ByProjectKeyMeOrdersPost post(com.commercetools.api.generated.models.me.MyOrderFromCartDraft myOrderFromCartDraft) {
      return new ByProjectKeyMeOrdersPost(apiHttpClient, projectKey, myOrderFromCartDraft);
   }
   
   public ByProjectKeyMeOrdersByIDRequestBuilder withId(String ID) {
      return new ByProjectKeyMeOrdersByIDRequestBuilder(apiHttpClient, projectKey, ID);
   }
}
