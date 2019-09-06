package com.commercetools.client;
import client.ApiHttpClient;

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
   
   public ByProjectKeySubscriptionsKeyByKeyPost post(com.commercetools.models.Subscription.SubscriptionUpdate subscriptionUpdate) {
      return new ByProjectKeySubscriptionsKeyByKeyPost(apiHttpClient, projectKey, key, subscriptionUpdate);
   }
   
   public ByProjectKeySubscriptionsKeyByKeyDelete delete() {
      return new ByProjectKeySubscriptionsKeyByKeyDelete(apiHttpClient, projectKey, key);
   }
   
}
