package com.commercetools.api.generated.client;
import io.vrap.rmf.base.client.ApiHttpClient;

public class ByProjectKeySubscriptionsByIDRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String ID;
   
   
   public ByProjectKeySubscriptionsByIDRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String ID) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.ID = ID;
   }
   
   public ByProjectKeySubscriptionsByIDGet get() {
      return new ByProjectKeySubscriptionsByIDGet(apiHttpClient, projectKey, ID);
   }
   
   public ByProjectKeySubscriptionsByIDPost post(com.commercetools.api.generated.models.subscription.SubscriptionUpdate subscriptionUpdate) {
      return new ByProjectKeySubscriptionsByIDPost(apiHttpClient, projectKey, ID, subscriptionUpdate);
   }
   
   public ByProjectKeySubscriptionsByIDDelete delete() {
      return new ByProjectKeySubscriptionsByIDDelete(apiHttpClient, projectKey, ID);
   }
   
}
