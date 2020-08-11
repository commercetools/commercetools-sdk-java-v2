package com.commercetools.api.client;
import io.vrap.rmf.base.client.ApiHttpClient;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public class ByProjectKeySubscriptionsKeyByKeyRequestBuilder {
   
   private final ApiHttpClient apiHttpClient;
   private final String projectKey;
   private final String key;
   
   
   public ByProjectKeySubscriptionsKeyByKeyRequestBuilder (final ApiHttpClient apiHttpClient,final String projectKey,final String key) {
      this.apiHttpClient = apiHttpClient;
      this.projectKey = projectKey;
      this.key = key;
   }
   
   public ByProjectKeySubscriptionsKeyByKeyGet get() {
      return new ByProjectKeySubscriptionsKeyByKeyGet(apiHttpClient, projectKey, key);
   }
   
   public ByProjectKeySubscriptionsKeyByKeyPost post(com.commercetools.api.models.subscription.SubscriptionUpdate subscriptionUpdate) {
      return new ByProjectKeySubscriptionsKeyByKeyPost(apiHttpClient, projectKey, key, subscriptionUpdate);
   }
   
   public ByProjectKeySubscriptionsKeyByKeyDelete delete() {
      return new ByProjectKeySubscriptionsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
